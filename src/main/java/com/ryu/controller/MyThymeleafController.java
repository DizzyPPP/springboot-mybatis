package com.ryu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Thymeleaf
 *
 * @author Ghost
 * @create 2018-08-02 9:45
 */

@Controller
public class MyThymeleafController {

    @RequestMapping("/TlViwer")
    public String TlViwer(Model map){
        map.addAttribute("host","Google");
        return "index";
    }

}
