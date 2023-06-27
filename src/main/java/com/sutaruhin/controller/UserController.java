package com.sutaruhin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
