package com.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 */
@Controller
@RequestMapping(value = "/")
public class HelloWorld {
    public void test (){
        ModelAndView mv = new ModelAndView();
//        mv.setViewName();
    }
}
