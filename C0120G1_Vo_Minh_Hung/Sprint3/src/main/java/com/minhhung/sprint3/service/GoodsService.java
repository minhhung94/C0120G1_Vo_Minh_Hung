package com.minhhung.sprint3.service;

import com.minhhung.sprint3.model.Goods;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface GoodsService {
    Page<Goods> findAllByDeleteFlagIsNull(Pageable pageable);

    Goods findAllByDeleteFlagIsNullAndIdIs(Integer id);
    List<Goods> findAllByDeleteFlagIsNull();

    void save(Goods goods);

    void remove(Integer id);
}
