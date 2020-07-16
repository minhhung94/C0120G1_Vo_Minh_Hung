package com.minhhung.sprint3.service;

import com.minhhung.sprint3.model.Bills;
import com.minhhung.sprint3.model.Goods;
import com.minhhung.sprint3.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Date;
import java.util.List;

public interface BillsService {
    List<Bills> findAllByDeleteFlagIsNull();

    Bills findAllByDeleteFlagIsNullAndIdIs(Integer id);

    Page<Bills> findAllByDeleteFlagIsNullAndGoods_IdAndCreateDateAndBillTypeAndUser_Id(Integer goods_id, Date createDate, Integer billType, Integer user_id, Pageable pageable);

    void save(Bills bills);

    void remove(Integer id);
}
