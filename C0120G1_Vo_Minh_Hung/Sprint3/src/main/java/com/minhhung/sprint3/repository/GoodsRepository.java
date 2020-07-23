package com.minhhung.sprint3.repository;

import com.minhhung.sprint3.entity.Category;
import com.minhhung.sprint3.entity.Goods;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.validation.constraints.NotEmpty;
import java.util.List;

public interface GoodsRepository extends JpaRepository<Goods,Integer> {

    List<Goods> findAllByDeleteFlagIsNull();

    @Query(value = "SELECT g FROM Goods g where g.category.nameCategory like %?1% and g.price=?2 and g.trademark like %?3% and g.saleOff=?4 and g.deleteFlag is null order by g.id" )
    List<Goods> searchAll(String nameCategory,Integer price,String trademark, Integer saleOff);
    @Query(value = "SELECT g FROM Goods g where g.category.nameCategory like %?1% and g.price=?2 and g.trademark like %?3% and g.deleteFlag is null order by g.id" )
    List<Goods> searchAllNameCategoryAndPriceAndTrademark(String nameCategory,Integer price,String trademark);
    @Query(value = "SELECT g FROM Goods g where g.category.nameCategory like %?1% and g.trademark like %?2% and g.saleOff=?3 and g.deleteFlag is null order by g.id" )
    List<Goods> searchAllNameCategoryAndTrademarkAndSaleOff(String nameCategory,String trademark, Integer saleOff);
    @Query(value = "SELECT g FROM Goods g where g.category.nameCategory like %?1% and g.trademark like %?2% and g.deleteFlag is null order by g.id" )
    List<Goods> searchAllNameCategoryAndTrademark(String nameCategory,String trademark);

    Page<Goods> findByDeleteFlagIsNullAndCategory_IdAndSaleOffAndPriceAndTrademark(Integer category_id, Integer saleOff, Integer price, String trademark, Pageable pageable);

    Goods findAllByDeleteFlagIsNullAndIdIs(Integer id);
}
