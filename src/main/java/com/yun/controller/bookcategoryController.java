package com.yun.controller;

import com.yun.pojo.Bookcategory;
import com.yun.service.imp.bookcategoryserviceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class bookcategoryController {
    @Autowired
    bookcategoryserviceImp bookcategoryserviceImp;

    @RequestMapping("/deletebookcategory")
    public String deletebookcategory(String bookcategorycategory, HttpServletRequest request) {
        bookcategoryserviceImp.deletebookcategoryservice(bookcategorycategory);
        selectbookcategory(request);
        return "r_user/r_bookcategory";
    }

    @RequestMapping("/addbookcategory")
    public String addbookcategory(String bookcategorycategory, HttpServletRequest request) {
        bookcategoryserviceImp.addbookcategoryservice(bookcategorycategory);
        selectbookcategory(request);
        return "r_user/r_bookcategory";
    }

    @RequestMapping("/selectbookcategory")
    public String selectbookcategory(HttpServletRequest request) {
        String bookcategoryContent="";
        for(Bookcategory bookcategory:bookcategoryserviceImp.selectbookcategoryservice()){
            bookcategoryContent+=bookcategory.getCategory();
            bookcategoryContent+="<br>";
        }
        request.setAttribute("bookcategorycategory",bookcategoryContent);
        return "r_user/r_bookcategory";
    }
}