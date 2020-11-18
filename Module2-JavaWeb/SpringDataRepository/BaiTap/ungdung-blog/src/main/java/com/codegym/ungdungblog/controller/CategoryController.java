package com.codegym.ungdungblog.controller;

import com.codegym.ungdungblog.model.Category;
import com.codegym.ungdungblog.service.BlogService;
import com.codegym.ungdungblog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class CategoryController {
    @Autowired
    private BlogService blogService;

    @Autowired
    private CategoryService categoryService;


    @GetMapping("/categorys")
    public ModelAndView listCategory(@RequestParam("s") Optional<String> s, @PageableDefault(value=5) Pageable pageable){
        Page<Category> categorys;
        if(s.isPresent()){
            categorys = categoryService.findAllByNameContaining(s.get(), pageable);
        }else {
            categorys = categoryService.findAll(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("/category/list");
        modelAndView.addObject("categorys", categorys);
        return modelAndView;
    }

    @GetMapping("/create-category")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("/category/create");
        modelAndView.addObject("category",new Category());
        return modelAndView;
    }

    @PostMapping("/create-category")
    public ModelAndView saveCategory(@ModelAttribute("category") Category category){
        categoryService.save(category);

        ModelAndView modelAndView = new ModelAndView("/category/create");
        modelAndView.addObject("category", new Category());
        modelAndView.addObject("message", "New category created successfully");
        return modelAndView;
    }

    @GetMapping("edit-category/{id}")
    public ModelAndView showCategory(@PathVariable Long id){
        Category category = categoryService.findById(id);
        if(category !=null){
            ModelAndView modelAndView = new ModelAndView("/category/edit");
            modelAndView.addObject("category",category);
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("/category/error404");
            return modelAndView;
        }
    }

    @PostMapping("edit-category")
    public ModelAndView updateCategory(@ModelAttribute("category") Category category){
        categoryService.save(category);
        ModelAndView modelAndView = new ModelAndView("/category/edit");
        modelAndView.addObject("category",category);
        modelAndView.addObject("message","Category updated successfully");
        return modelAndView;
    }
    @GetMapping("/delete-category/{id}")
    public ModelAndView showDeteleForm(@PathVariable Long id){
        Category category = categoryService.findById(id);
        if(category != null){
            ModelAndView modelAndView = new ModelAndView("/category/delete");
            modelAndView.addObject("category",category);
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete-category")
    public String deleteCategory(@ModelAttribute("category") Category category){
        categoryService.remove(category.getId());
        return "redirect:categorys";
    }
}
