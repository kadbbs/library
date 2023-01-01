package com.yun.controller;

import com.yun.pojo.Root;
import com.yun.service.imp.rootuserserviceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class root_verify {

    @Autowired
    rootuserserviceImp rusi;
    @RequestMapping("/log")
    //@ResponseBody
    public String verify(String xxx, int yyy,HttpServletRequest request){
        for(int i=0;i<rusi.selectrootpage().size();i++){
            if(rusi.selectrootpage().get(i).name.equals(xxx)&&rusi.selectrootpage().get(i).pwd==yyy){
                System.out.println(rusi.selectrootpage().get(i).name);
                return "homepage/r_function";
            }

        }

        request.setAttribute("logfail","用户名或密码不正确");
        return "log/log";

    }
}
