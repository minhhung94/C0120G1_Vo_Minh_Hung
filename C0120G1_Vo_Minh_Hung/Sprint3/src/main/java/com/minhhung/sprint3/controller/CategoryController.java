package com.minhhung.sprint3.controller;

import com.minhhung.sprint3.model.Category;
import com.minhhung.sprint3.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/category")
    public ModelAndView listAccompany(Pageable pageable) {
        Page<Category> categories = categoryService.findAllByDeleteFlagIsNull(pageable);
        return new ModelAndView("categorie/list", "categories", categories);
    }
}
