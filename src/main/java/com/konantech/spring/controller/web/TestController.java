package com.konantech.spring.controller.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

    private static Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(params = "!acton")
    public String defaultActon() {
        return "redirect:test.do?acton=top";
    }

    @RequestMapping(params = "acton=top")
    public String top() throws Exception {
        return "hello";
    }

}