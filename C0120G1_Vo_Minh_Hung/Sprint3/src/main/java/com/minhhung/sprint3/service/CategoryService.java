package com.minhhung.sprint3.service;

import com.minhhung.sprint3.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CategoryService {
    List<Category> findAllByDeleteFlagIsNull();
    Page<Category> findAllByDeleteFlagIsNull(Pageable pageable);
    Category findAllByDeleteFlagIsNullAndIdIs(Integer id);

    void save(Category category);

    void remove(Integer id);
}
