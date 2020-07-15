package com.minhhung.sprint3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainCotroller {
    @GetMapping("/")
    public String index()   {
        return "layout_new";
    }
}
