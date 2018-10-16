package com.ryu.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 * @create 2018-07-23 9:08
 */

@Controller
public class MyErrorController implements ErrorController {
    @Override
    public String getErrorPath() {
        return "errorPage";
    }

    @RequestMapping("/error")
    public String error(){
        return getErrorPath();
    }
}
