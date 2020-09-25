package com.minhhung.sprint3.service.impl;

import com.minhhung.sprint3.entity.Bills;
import com.minhhung.sprint3.repository.BillsRepository;
import com.minhhung.sprint3.service.BillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotEmpty;
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
    public List<Bills> findAllByDeleteFlagIsNullAndBillTypeAndQuantityAndNameGoodContainingAndFullNameContaining(Integer billType, Integer quantity, String nameGood, String fullName) {
        return billsRepository.searchByDeleteFlagIsNullAndBillTypeAndQuantityAndNameGoodContainingAndFullName(billType, quantity, nameGood, fullName);
    }

    @Override
    public List<Bills> searchBills(Integer quantity, String nameGood, String fullName) {
        return billsRepository.searchBills(quantity, nameGood, fullName);
    }

    @Override
    public List<Bills> searchBillType(Integer billType, String nameGood, String fullName) {
        return billsRepository.searchBillType(billType, nameGood, fullName);
    }

    @Override
    public List<Bills> findAllByDeleteFlagIsNullAndUser_FullNameContaining(String user_fullName) {
        return billsRepository.findAllByDeleteFlagIsNullAndUser_FullNameContaining(user_fullName);
    }

    @Override
    public List<Bills> searchBillsNameGoodAndFullName(String nameGood, String fullName) {
        return billsRepository.searchBillsNameGoodAndFullName(nameGood, fullName);
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
