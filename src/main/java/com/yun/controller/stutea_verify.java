package com.yun.controller;

import com.yun.service.imp.rootuserserviceImp;
import com.yun.service.imp.stuteaVerifyserviceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class stutea_verify {

    @Autowired
    stuteaVerifyserviceImp rusi;
    @RequestMapping("/stutealog")
    //@ResponseBody
    public String verify(String xxx, int yyy,HttpServletRequest request){
        for(int i=0;i<rusi.selectstservice().size();i++){
            if(rusi.selectstservice().get(i).getAccount().equals(xxx)&&rusi.selectstservice().get(i).getPwd()==yyy){
                //System.out.println(rusi.selectstservice().get(i).name);
                return "homepage/st_function";
            }

        }

        request.setAttribute("logfail","用户名或密码不正确");
        return "log/stutealog";

    }



}
