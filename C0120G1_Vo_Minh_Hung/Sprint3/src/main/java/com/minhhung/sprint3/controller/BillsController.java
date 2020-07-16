package com.minhhung.sprint3.controller;

import com.minhhung.sprint3.model.Bills;
import com.minhhung.sprint3.model.Goods;
import com.minhhung.sprint3.model.User;
import com.minhhung.sprint3.service.BillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/bills")
public class BillsController {
    @Autowired
    private BillsService billsService;

//    @GetMapping(value = "/paging", params = {"page", "size", "goods_id","createDate","billType","user_id"})
//    public Page<Bills> getListBills(@RequestParam("page") int page,
//                                    @RequestParam("size") int size,
//                                    @RequestParam("goods_id") int goods_id,
//                                    @RequestParam("createDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date createDate,
//                                    @RequestParam("billType") int billType,
//                                    @RequestParam("user_id") int user_id) {
//        Page<Bills> bills;
//        bills= billsService.findAllByDeleteFlagIsNullAndGoods_IdAndCreateDateAndBillTypeAndUser_Id(goods_id,createDate,billType,user_id,PageRequest.of(page, size));
//        return bills;
//    }

    @GetMapping("")
    public List<Bills> getAllBills() {
        return billsService.findAllByDeleteFlagIsNull();
    }

//    @RequestMapping(value = { "/list", "" }, method = RequestMethod.GET)
//    public ModelAndView home() {
//        ModelAndView model = new ModelAndView();
//
//        Bills bills = new Bills();
//        model.addObject("bills", bills);
//
//        model.setViewName("");
//        return model;
//    }

//    @RequestMapping(value = "/loadCityByCountry", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//    public @ResponseBody List<City> loadCityByCountry(@RequestBody CountryCriteria countryCriteria) {
//        List<City> cities = cityService.getCitiesByCountry(countryCriteria.getCountryId());
//
//        return cities;
//    }
}
