package com.Spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/board/*")
public class BoardController {

    @GetMapping("/blist")
    public ModelAndView blistGet(ModelAndView mv){
        mv.setViewName("board/blist");
        return mv;
    }

}
