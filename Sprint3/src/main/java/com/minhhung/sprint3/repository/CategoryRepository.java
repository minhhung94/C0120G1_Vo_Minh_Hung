package com.minhhung.sprint3.repository;

import com.minhhung.sprint3.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
    List<Category> findAllByDeleteFlagIsNull();
    Page<Category> findAllByDeleteFlagIsNullAndNameCategoryContaining(String nameCategory, Pageable pageable);
    Category findAllByDeleteFlagIsNullAndIdIs(Integer id);
}
