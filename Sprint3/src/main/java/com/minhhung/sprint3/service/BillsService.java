package com.minhhung.sprint3.service;

import com.minhhung.sprint3.entity.Bills;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.List;

public interface BillsService {
    List<Bills> findAllByDeleteFlagIsNull();

    Bills findAllByDeleteFlagIsNullAndIdIs(Integer id);

    Page<Bills> findAllByDeleteFlagIsNullAndGoods_IdAndCreateDateAndBillTypeAndUser_Id(Integer goods_id, Date createDate, Integer billType, Integer user_id, Pageable pageable);
    List<Bills> findAllByDeleteFlagIsNullAndBillTypeAndQuantityAndNameGoodContainingAndFullNameContaining(Integer billType, Integer quantity, String nameGood, String fullName);
    List<Bills> searchBills(Integer quantity, String nameGood, String fullName);
    List<Bills> searchBillType(Integer billType, String nameGood, String fullName);
    List<Bills> findAllByDeleteFlagIsNullAndUser_FullNameContaining(String user_fullName);
    List<Bills> searchBillsNameGoodAndFullName(String nameGood, String fullName);
    void save(Bills bills);

    void remove(Integer id);
}
