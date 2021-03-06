package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.model.ProductServiceImpl;
import com.codegym.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProductController {
    private ProductService productService=new ProductServiceImpl();

    @GetMapping("/")
    public String index(Model model)   {
        model.addAttribute("listproduct",productService.findAll());
        return "index";
    }
    @GetMapping("/product/create")
    public String create(Model model){
        model.addAttribute("product",new Product());
        return "create";
    }
    @PostMapping("/product/save")
    public String save( Product product, RedirectAttributes redirect){
        product.setId((int)(Math.random()*1000));
        productService.save(product);
        redirect.addFlashAttribute("success","add product successly!!!");
        return "redirect:/";

    }
    @GetMapping("/product/{id}/edit")
    public String edit(@PathVariable int id, Model model){
        model.addAttribute("product",productService.findById(id));
        return "edit";
    }
}
