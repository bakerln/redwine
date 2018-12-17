package com.system.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 */
@Controller
@RequestMapping(value = "/")
public class HelloWorld {

    @RequestMapping(value = "/login")
    public ModelAndView test (HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login");
        return mv;
    }

    @RequestMapping(value = "/logout")
    public ModelAndView logout(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("logout");
        return mv;
    }
}
