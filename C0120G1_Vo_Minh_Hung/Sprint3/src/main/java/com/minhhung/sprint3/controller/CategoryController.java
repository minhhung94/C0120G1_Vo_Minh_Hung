package com.minhhung.sprint3.controller;

import com.minhhung.sprint3.entity.Category;
import com.minhhung.sprint3.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryController {

    private List<Category> categoryList = new ArrayList<Category>();
    @Autowired
    private CategoryService categoryService;

//    @GetMapping("/category")
//    public ModelAndView listAccompany(Pageable pageable) {
//        Page<Category> categories = categoryService.findAllByDeleteFlagIsNull(pageable);
//        return new ModelAndView("categorie/list", "categories", categories);
//    }
//
//    @RequestMapping(value = "/category", method = RequestMethod.GET)
//    public @ResponseBody
//    String addNew(HttpServletRequest request) {
//        String id = request.getParameter("id");
//        String name = request.getParameter("name");
//
//        Category category = new Category(Integer.parseInt(id),name);
//        categoryList.add(category);
//
//        ObjectMapper mapper = new ObjectMapper();
//        String ajaxResponse = "";
//        try {
//            ajaxResponse = mapper.writeValueAsString(person);
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }
//
//        return ajaxResponse;
//    }
}
