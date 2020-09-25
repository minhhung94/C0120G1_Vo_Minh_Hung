package com.minhhung.sprint3.service;

import com.minhhung.sprint3.entity.Category;
import com.minhhung.sprint3.entity.Goods;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface GoodsService {
    Page<Goods> findAllByDeleteFlagIsNull(Pageable pageable);

    Goods findAllByDeleteFlagIsNullAndIdIs(Integer id);
    List<Goods> findAllByDeleteFlagIsNull();

    List<Goods> searchAll(String nameCategory,Integer price,String trademark, Integer saleOff);
    List<Goods> searchAllNameCategoryAndPriceAndTrademark(String nameCategory,Integer price,String trademark);
    List<Goods> searchAllNameCategoryAndTrademarkAndSaleOff(String nameCategory,String trademark, Integer saleOff);
    List<Goods> searchAllNameCategoryAndTrademark(String nameCategory,String trademark);

    Page<Goods> findByDeleteFlagIsNullAndCategory_IdAndSaleOffAndPriceAndTrademark(Integer category_id, Integer saleOff, Integer price, String trademark, Pageable pageable);

    void save(Goods goods);

    void remove(Integer id);
}
