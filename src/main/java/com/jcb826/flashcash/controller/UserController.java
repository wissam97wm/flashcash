package com.jcb826.flashcash.controller;

import com.jcb826.flashcash.model.Transfer;
import com.jcb826.flashcash.model.User;
import com.jcb826.flashcash.service.UserService;
import com.jcb826.flashcash.service.form.SignInForm;
import com.jcb826.flashcash.service.form.SignUpForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller

public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/")
    public ModelAndView home(Model model) {
        return new ModelAndView("index");
    }

    @PostMapping("/signup")
    public ModelAndView processRequest(@ModelAttribute("signUpForm") SignUpForm form) {
        userService.registration(form);
        return new ModelAndView("signin", "signInForm", new SignInForm());
    }

    @GetMapping("/signup")
    public ModelAndView showRegisterForm() {
        return new ModelAndView("signup", "signUpForm", new SignUpForm());
    }

    @GetMapping("/home")
    public String logOff(Model model) {
        return "home";
    }

// todo implements others controllers
}

