package com.minhhung.sprint3.service.impl;

import com.minhhung.sprint3.entity.Category;
import com.minhhung.sprint3.entity.Goods;
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
        return goodsRepository.findAll(pageable);
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
    public List<Goods> searchAll(String nameCategory, Integer price, String trademark, Integer saleOff) {
        return goodsRepository.searchAll(nameCategory, price, trademark, saleOff);
    }

    @Override
    public List<Goods> searchAllNameCategoryAndPriceAndTrademark(String nameCategory, Integer price, String trademark) {
        return goodsRepository.searchAllNameCategoryAndPriceAndTrademark(nameCategory, price, trademark);
    }

    @Override
    public List<Goods> searchAllNameCategoryAndTrademarkAndSaleOff(String nameCategory, String trademark, Integer saleOff) {
        return goodsRepository.searchAllNameCategoryAndTrademarkAndSaleOff(nameCategory, trademark, saleOff);
    }

    @Override
    public List<Goods> searchAllNameCategoryAndTrademark(String nameCategory, String trademark) {
        return goodsRepository.searchAllNameCategoryAndTrademark(nameCategory, trademark);
    }

    @Override
    public Page<Goods> findByDeleteFlagIsNullAndCategory_IdAndSaleOffAndPriceAndTrademark(Integer category_id, Integer saleOff, Integer price, String trademark, Pageable pageable) {
        return goodsRepository.findByDeleteFlagIsNullAndCategory_IdAndSaleOffAndPriceAndTrademark(category_id, saleOff, price, trademark, pageable);
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
