package com.minhhung.sprint3.service.impl;

import com.minhhung.sprint3.model.Category;
import com.minhhung.sprint3.repository.CategoryRepository;
import com.minhhung.sprint3.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> findAllByDeleteFlagIsNull() {
        return categoryRepository.findAllByDeleteFlagIsNull();
    }

    @Override
    public Page<Category> findAllByDeleteFlagIsNull(Pageable pageable) {
        return categoryRepository.findAllByDeleteFlagIsNull(pageable);
    }

    @Override
    public Category findAllByDeleteFlagIsNullAndIdIs(Integer id) {
        return categoryRepository.findAllByDeleteFlagIsNullAndIdIs(id);
    }

    @Override
    public void save(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void remove(Integer id) {
        categoryRepository.deleteById(id);
    }
}
