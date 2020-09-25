package com.minhhung.sprint3.repository;

import com.minhhung.sprint3.entity.Bills;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.List;

@Repository
public interface BillsRepository extends JpaRepository<Bills,Integer> {
    List<Bills> findAllByDeleteFlagIsNull();

    Page<Bills> findAllByDeleteFlagIsNullAndGoods_IdAndCreateDateAndBillTypeAndUser_Id(Integer goods_id, Date createDate, Integer billType, Integer user_id, Pageable pageable);

    @Query(value = "SELECT b FROM Bills b where b.billType = ?1 and b.quantity =?2 and b.goods.nameGood like %?3% and b.user.fullName like %?4% and b.deleteFlag is null order by b.id" )
    List<Bills> searchByDeleteFlagIsNullAndBillTypeAndQuantityAndNameGoodContainingAndFullName(Integer billType, Integer quantity, String goods_nameGood, String user_fullName);

    @Query(value = "SELECT b FROM Bills b where b.quantity =?1 and b.goods.nameGood like %?2% and b.user.fullName like %?3% and b.deleteFlag is null order by b.id" )
    List<Bills> searchBills(Integer quantity, String nameGood, String fullName);

    @Query(value = "SELECT b FROM Bills b where b.billType =?1 and b.goods.nameGood like %?2% and b.user.fullName like %?3% and b.deleteFlag is null order by b.id" )
    List<Bills> searchBillType(Integer billType, String nameGood, String fullName);

    @Query(value = "SELECT b FROM Bills b where b.goods.nameGood like %?1% and b.user.fullName like %?2% and b.deleteFlag is null order by b.id" )
    List<Bills> searchBillsNameGoodAndFullName(String nameGood, String fullName);

    Bills findAllByDeleteFlagIsNullAndIdIs(Integer id);

    List<Bills> findAllByDeleteFlagIsNullAndUser_FullNameContaining(String user_fullName);
}
