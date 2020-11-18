package com.codegym.ungdungblog.repository;

import com.codegym.ungdungblog.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {
    Page<Category> findAllByNameContaining(String name, Pageable pageable);
}
