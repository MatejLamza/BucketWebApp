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
@RequestMapping("login")
public class LoginController {

    @GetMapping
    public String loginUser(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    /**
     * Post mapping "process" gives alias to route that we can fetch in html using thymeleaf.
     */
    @PostMapping
    public String loginUserProcessed(@Valid User user, Errors errors) {
        if (errors.hasErrors()) {
            return "login";
        }
        return "login-processed";
    }
}
