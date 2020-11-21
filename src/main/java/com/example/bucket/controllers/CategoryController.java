package com.example.bucket.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("category")
public class CategoryController {

    @GetMapping("sports")
    public String getSports() {
        System.out.println("Hello getting sports");
        return "/category/sports";
    }
}
