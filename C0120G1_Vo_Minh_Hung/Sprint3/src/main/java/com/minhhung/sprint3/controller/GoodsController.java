package com.minhhung.sprint3.controller;

import com.minhhung.sprint3.entity.Bills;
import com.minhhung.sprint3.entity.Goods;
import com.minhhung.sprint3.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

//@SessionAttributes("cart")
@RestController
@RequestMapping("")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @GetMapping("/goods")
    public List<Goods> getAllBills() {
        return goodsService.findAllByDeleteFlagIsNull();
    }

    @GetMapping("/listGoods")
    public ModelAndView listGoods() {
        return new ModelAndView("goods/list");
    }

    @GetMapping(value = "/searchGoods", params = {"nameCategory", "price", "trademark", "saleOff"})
    public List<Goods> getListGoods(@RequestParam(value = "nameCategory",defaultValue = "") String nameCategory,
                                    @RequestParam(value = "price") int price,
                                    @RequestParam(value = "trademark",defaultValue = "") String trademark,
                                    @RequestParam(value = "saleOff") int saleOff) {
        List<Goods> goods;
        goods = goodsService.searchAll(nameCategory,price,trademark,saleOff);
        return goods;
    }

    @GetMapping(value = "/searchGoodsString", params = {"nameCategory", "trademark"})
    public List<Goods> getListGoods(@RequestParam(value = "nameCategory",defaultValue = "") String nameCategory,
                                    @RequestParam(value = "trademark",defaultValue = "") String trademark
                                    ) {
        List<Goods> goods;
        goods = goodsService.searchAllNameCategoryAndTrademark(nameCategory,trademark);
        return goods;
    }

    @GetMapping(value = "/searchGoodsPrice", params = {"nameCategory", "price", "trademark"})
    public List<Goods> getListGoodsPrice(@RequestParam(value = "nameCategory",defaultValue = "") String nameCategory,
                                    @RequestParam(value = "price") int price,
                                    @RequestParam(value = "trademark",defaultValue = "") String trademark
                                    ) {
        List<Goods> goods;
        goods = goodsService.searchAllNameCategoryAndPriceAndTrademark(nameCategory,price,trademark);
        return goods;
    }

    @GetMapping(value = "/searchGoodsSale", params = {"nameCategory", "trademark", "saleOff"})
    public List<Goods> getListGoodsSaleOff(@RequestParam(value = "nameCategory",defaultValue = "") String nameCategory,
                                    @RequestParam(value = "trademark",defaultValue = "") String trademark,
                                    @RequestParam(value = "saleOff") int saleOff) {
        List<Goods> goods;
        goods = goodsService.searchAllNameCategoryAndTrademarkAndSaleOff(nameCategory,trademark,saleOff);
        return goods;
    }
}
