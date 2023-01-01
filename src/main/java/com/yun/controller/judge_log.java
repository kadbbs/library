package com.yun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class judge_log {
    @RequestMapping("/log1")
    public String panduan(String xxx, int yyy, HttpServletRequest request){
        if(xxx.equals("yun")&&yyy==123){
            return "homepage/r_function";
        }else {
            request.setAttribute("logfail","用户名或密码不正确");

            return "log/log";
        }

    }
}
