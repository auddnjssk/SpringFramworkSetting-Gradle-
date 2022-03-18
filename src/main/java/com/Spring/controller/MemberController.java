package com.Spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/member/*")

public class MemberController {
    private static final Logger log = LoggerFactory.getLogger(BoardController.class);

    @GetMapping("/login")
    public void loginGet(){
        log.info("login창 접속!");
    }
}
