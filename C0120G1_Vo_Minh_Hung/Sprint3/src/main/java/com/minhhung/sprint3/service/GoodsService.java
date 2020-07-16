package com.minhhung.sprint3.service;

import com.minhhung.sprint3.model.Category;
import com.minhhung.sprint3.model.Goods;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface GoodsService {
    Page<Goods> findAllByDeleteFlagIsNull(Pageable pageable);

    Goods findAllByDeleteFlagIsNullAndIdIs(Integer id);
    List<Goods> findAllByDeleteFlagIsNull();
    Page<Goods> findByDeleteFlagIsNullAndTrademark(String trademark, Pageable pageable);
    Page<Goods> findByDeleteFlagIsNullAndCategoryAndSaleOffAndPriceAndTrademark(Category category, Integer saleOff, Integer price, String trademark, Pageable pageable);

    void save(Goods goods);

    void remove(Integer id);
}
