package com.forcat.forcat.controller;

import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@EnableJpaAuditing
public class MainController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }



}
