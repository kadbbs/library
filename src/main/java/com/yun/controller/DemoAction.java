package com.yun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoAction {
    @RequestMapping("/root")

    public String root(){
        System.out.println("get");
        return "log/log";
    }
    @RequestMapping("/stutea")

    public String stutea(){
        System.out.println("get");
        return "log/stutealog";
    }
}
