package com.minhhung.sprint3.entity;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Goods> goods;

    public Cart() {
        this.goods=new ArrayList<Goods>();
    }

    public Cart(List<Goods> good) {
        this.goods = good;
    }

    public List<Goods> getgoods() {
        return goods;
    }

    public void setgoods(List<Goods> good) {
        this.goods = good;
    }

    public void addToCart(Goods good) {
        goods.add(good);
    }

    public void delete(Integer id){
        for (Goods good : goods
        ) {
            if (good.getId().equals(id)) {
                goods.remove(good);
                return;
            }
        }
    }
}
