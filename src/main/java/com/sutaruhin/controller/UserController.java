package com.sutaruhin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sutaruhin.entity.User;
import com.sutaruhin.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService service;


    @GetMapping("/list")
    public String getList(Model model) {

        model.addAttribute("userlist", service.getUserList());

        return "user/list";
    }

    @GetMapping("/register")
    public String getRegister(@ModelAttribute User user) {

        return "user/register";
    }

    @PostMapping("/register")
    public String postRegister(User user) {

        service.saveUser(user);

        return "redirect:/user/list";
    }

    @GetMapping("/update/{id}/")
    public String getUser(@PathVariable("id") Integer id, Model model) {

        model.addAttribute("user", service.getUser(id));

        return "user/update";
    }

    @PostMapping("/update/{id}/")
    public String postUser(User user) {
        service.saveUser(user);

        return "redirect:/user/list";
    }


}
