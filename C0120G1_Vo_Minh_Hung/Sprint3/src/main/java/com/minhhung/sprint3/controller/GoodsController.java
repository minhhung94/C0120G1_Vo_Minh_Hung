package com.minhhung.sprint3.controller;

import com.minhhung.sprint3.model.Goods;
import com.minhhung.sprint3.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

//@SessionAttributes("cart")
@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

//    @GetMapping("/goods")
//    public ModelAndView listEmployee(@RequestParam("s") Optional<String> s, @PageableDefault(value = 5) Pageable pageable) {
//        Page<Goods> goods;
//        if (s.isPresent()) {
//            goods = goodsService.findByDeleteFlagIsNullAndTrademark(s.get(),pageable);
//        } else {
//            goods= goodsService.findAllByDeleteFlagIsNull(pageable);
//        }
//        return new ModelAndView("goods/list", "goods", goods);
//    }

    @GetMapping("")
    public List<Goods> getAllGoods() {
        return goodsService.findAllByDeleteFlagIsNull();
    }

}
