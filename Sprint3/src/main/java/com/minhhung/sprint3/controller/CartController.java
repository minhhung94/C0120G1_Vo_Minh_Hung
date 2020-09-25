package com.minhhung.sprint3.controller;

import com.minhhung.sprint3.entity.Goods;
import com.minhhung.sprint3.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("")
public class CartController {
    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/cart")
    public String Index(@CookieValue(value = "setnameGood", defaultValue = "") String setnameGood, Model model) {
        Cookie cookie = new Cookie("setnameGood", setnameGood);
        model.addAttribute("cookieValue", cookie);
        return "cart";
    }
    @PostMapping("/docart")
    public String doCart(@ModelAttribute("goodId") Integer goodId, Model model, @CookieValue(value = "setnameGood", defaultValue = "") String setnameGood,
                         HttpServletResponse response, HttpServletRequest request) {

        Goods temp = goodsService.findAllByDeleteFlagIsNullAndIdIs(goodId);
        if (temp.getNameGood() != null)
            setnameGood = temp.getNameGood();

        // create cookie and set it in response
        Cookie cookie = new Cookie("setnameGood", setnameGood);
        cookie.setMaxAge(24 * 60 * 60);
        response.addCookie(cookie);

        //get all cookies
        Cookie[] cookies = request.getCookies();
        //iterate each cookie
        for (Cookie ck : cookies) {
            //display only the cookie with the name 'setUser'
            if (ck.getName().equals("setnameGood")) {
                model.addAttribute("cookieValue", ck);
                break;
            } else {
                ck.setValue("");
                model.addAttribute("cookieValue", ck);
                break;
            }
        }
        return "cart";
    }
}
