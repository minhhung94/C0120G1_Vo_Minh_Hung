package com.minhhung.sprint3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("")
public class MainCotroller {
//    @GetMapping("/")
//    public String index()   {
//        return "layout_new";
//    }

    @GetMapping("")
    public ModelAndView listBills() {
        return new ModelAndView("bills/list");
    }


}
