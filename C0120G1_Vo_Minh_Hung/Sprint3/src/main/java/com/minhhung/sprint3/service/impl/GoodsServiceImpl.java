package com.minhhung.sprint3.service.impl;

import com.minhhung.sprint3.model.Goods;
import com.minhhung.sprint3.repository.GoodsRepository;
import com.minhhung.sprint3.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsRepository goodsRepository;

    @Override
    public Page<Goods> findAllByDeleteFlagIsNull(Pageable pageable) {
        return goodsRepository.findAllByDeleteFlagIsNull(pageable);
    }

    @Override
    public Goods findAllByDeleteFlagIsNullAndIdIs(Integer id) {
        return goodsRepository.findAllByDeleteFlagIsNullAndIdIs(id);
    }

    @Override
    public List<Goods> findAllByDeleteFlagIsNull() {
        return goodsRepository.findAllByDeleteFlagIsNull();
    }

    @Override
    public void save(Goods goods) {
        goodsRepository.save(goods);
    }

    @Override
    public void remove(Integer id) {
        Goods goods = goodsRepository.findAllByDeleteFlagIsNullAndIdIs(id);
        goods.setDeleteFlag(1);
        goodsRepository.save(goods);
    }
}
