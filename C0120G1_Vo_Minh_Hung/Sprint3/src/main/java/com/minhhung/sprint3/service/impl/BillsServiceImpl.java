package com.minhhung.sprint3.service.impl;

import com.minhhung.sprint3.model.Bills;
import com.minhhung.sprint3.model.Goods;
import com.minhhung.sprint3.model.User;
import com.minhhung.sprint3.repository.BillsRepository;
import com.minhhung.sprint3.service.BillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BillsServiceImpl implements BillsService {
    @Autowired
    private BillsRepository billsRepository;


    @Override
    public List<Bills> findAllByDeleteFlagIsNull() {
        return billsRepository.findAllByDeleteFlagIsNull();
    }

    @Override
    public Bills findAllByDeleteFlagIsNullAndIdIs(Integer id) {
        return billsRepository.findAllByDeleteFlagIsNullAndIdIs(id);
    }

    @Override
    public Page<Bills> findAllByDeleteFlagIsNullAndGoods_IdAndCreateDateAndBillTypeAndUser_Id(Integer goods_id, Date createDate, Integer billType, Integer user_id, Pageable pageable) {
        return billsRepository.findAllByDeleteFlagIsNullAndGoods_IdAndCreateDateAndBillTypeAndUser_Id(goods_id, createDate, billType, user_id, pageable);
    }

    @Override
    public void save(Bills bills) {
        billsRepository.save(bills);
    }

    @Override
    public void remove(Integer id) {
        Bills bill = billsRepository.findAllByDeleteFlagIsNullAndIdIs(id);
        bill.setDeleteFlag(1);
        billsRepository.save(bill);
    }
}
