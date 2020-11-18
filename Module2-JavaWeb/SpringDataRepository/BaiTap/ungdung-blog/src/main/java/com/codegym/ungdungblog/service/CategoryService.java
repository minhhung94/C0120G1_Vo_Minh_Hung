package com.codegym.ungdungblog.service;

import com.codegym.ungdungblog.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CategoryService {

    Category findById(Long id);

    void save(Category category);

    void remove(Long id);

    Page<Category> findAll(Pageable pageable);

    Page<Category> findAllByNameContaining(String name, Pageable pageable);
}
