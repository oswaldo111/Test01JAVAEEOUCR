package com.test01javaeeoucr.test01javaeeoucr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping 
    public String home() {
            return "index";
    }

}
