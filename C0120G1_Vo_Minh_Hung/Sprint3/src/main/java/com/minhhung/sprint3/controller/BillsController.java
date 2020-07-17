package com.minhhung.sprint3.controller;

import com.minhhung.sprint3.entity.Bills;
import com.minhhung.sprint3.service.BillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("")
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

    @GetMapping("/bills")
    public List<Bills> getAllBills() {
        return billsService.findAllByDeleteFlagIsNull();
    }

    @GetMapping("/listBills")
    public ModelAndView listBills() {
        return new ModelAndView("bills/list");
    }

    @GetMapping(value = "/searchBills", params = {"billsType", "quantity", "nameGood", "nameUser"})
    public List<Bills> getListBills(   @RequestParam("billsType") int billsType,
                                          @RequestParam(value = "quantity") int quantity,
                                          @RequestParam(value = "nameGood",defaultValue = "") String nameGood,
                                          @RequestParam(value = "nameUser",defaultValue = "") String nameUser) {
        List<Bills> bills;
        bills = billsService.findAllByDeleteFlagIsNullAndBillTypeAndQuantityAndNameGoodContainingAndFullNameContaining(billsType, quantity, nameGood, nameUser);
        return bills;
    }

    @GetMapping(value = "/searchBillQuantity", params = { "quantity", "nameGood", "nameUser"})
    public List<Bills> getListBill(       @RequestParam(value = "quantity") int quantity,
                                          @RequestParam(value = "nameGood",defaultValue = "") String nameGood,
                                          @RequestParam(value = "nameUser",defaultValue = "") String nameUser) {
        List<Bills> bills;
        bills = billsService.searchBills(quantity, nameGood, nameUser);
        return bills;
    }

    @GetMapping(value = "/searchBillType", params = { "billsType", "nameGood", "nameUser"})
    public List<Bills> getListBillType(       @RequestParam(value = "billsType") int billsType,
                                          @RequestParam(value = "nameGood",defaultValue = "") String nameGood,
                                          @RequestParam(value = "nameUser",defaultValue = "") String nameUser) {
        List<Bills> bills;
        bills = billsService.searchBillType(billsType, nameGood, nameUser);
        return bills;
    }

    @GetMapping(value = "/searchBillName", params = { "nameGood", "nameUser"})
    public List<Bills> getListBillName(@RequestParam(value = "nameGood",defaultValue = "") String nameGood,
                                       @RequestParam(value = "nameUser",defaultValue = "") String nameUser) {
        List<Bills> bills;
        bills = billsService.searchBillsNameGoodAndFullName(nameGood, nameUser);
        return bills;
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
