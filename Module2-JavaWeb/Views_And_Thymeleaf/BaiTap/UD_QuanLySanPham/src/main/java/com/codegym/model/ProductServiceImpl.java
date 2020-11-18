package com.codegym.model;

import com.codegym.service.ProductService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> listProduct;

    static {
        listProduct = new HashMap<>();
        listProduct.put(1,new Product(1,"Chibi 1",18000000, "img/1.png","China"));
        listProduct.put(2,new Product(2,"Chibi 2",15000000, "img/2.png","Korea"));
        listProduct.put(3,new Product(3,"Chibi 3",8000000, "img/3.png","Taiwan"));
        listProduct.put(4,new Product(4,"Chibi 4",19000000, "img/4.png","China"));
        listProduct.put(5,new Product(5,"Chibi 5",17000000, "img/5.png","Tokyo"));
        listProduct.put(6,new Product(6,"Chibi 6",16000000, "img/6.png","Kyoto"));
    }


    @Override
    public List<Product> findAll() {
        return new ArrayList<>(listProduct.values());
    }

    @Override
    public void save(Product product) {
        listProduct.put(product.getId(),product);

    }

    @Override
    public Product findById(int id) {
        return listProduct.get(id);
    }

    @Override
    public void update(int id, Product product) {
        listProduct.put(id,product);

    }

    @Override
    public void remove(int id) {
        listProduct.remove(id);
    }
}
