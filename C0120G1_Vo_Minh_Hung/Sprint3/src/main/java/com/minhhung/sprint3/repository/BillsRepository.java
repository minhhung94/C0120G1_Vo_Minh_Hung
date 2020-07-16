package com.minhhung.sprint3.repository;

import com.minhhung.sprint3.model.Bills;
import com.minhhung.sprint3.model.Goods;
import com.minhhung.sprint3.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface BillsRepository extends JpaRepository<Bills,Integer> {
    List<Bills> findAllByDeleteFlagIsNull();

    Page<Bills> findAllByDeleteFlagIsNullAndGoods_IdAndCreateDateAndBillTypeAndUser_Id(Integer goods_id, Date createDate, Integer billType, Integer user_id, Pageable pageable);

    Bills findAllByDeleteFlagIsNullAndIdIs(Integer id);
}
