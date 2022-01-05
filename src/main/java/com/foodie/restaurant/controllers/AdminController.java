package com.foodie.restaurant.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Safna
 */
@Controller
@RequestMapping("admin")
public class AdminController {
    @GetMapping("addAppetizer")
    @ResponseBody
    public String addAppetizer(Model model){
        return "Adding Menu";
    }
}
