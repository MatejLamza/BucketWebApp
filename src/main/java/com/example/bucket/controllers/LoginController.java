package com.example.bucket.controllers;

import com.example.bucket.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("user")
public class LoginController {

    @GetMapping("home")
    public String loginUser(Model model) {
        model.addAttribute("user", new User());
        return "/user/home";
    }

    /**
     * Post mapping "process" gives alias to route that we can fetch in html using thymeleaf.
     */
    @PostMapping("temp")
    public String loginUserProcessed(@Valid User user, Errors errors) {
        if (errors.hasErrors()) {
            return "/user/home";
        }
        return "/user/bucket-name";
    }
}
