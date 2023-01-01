package com.yun.controller;

import com.yun.pojo.School;
import com.yun.service.imp.schoolserviceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class schoolController {
    @Autowired
    schoolserviceImp schoolserviceImp;
    @RequestMapping("/deleteschool")
    public String deleteschool(String schoolname,HttpServletRequest request){
        schoolserviceImp.deleteschoolservice(schoolname);
        selectschool(request);
        return "r_user/r_school";
    }
    @RequestMapping("/addschool")
    public String addschool(String schoolname,HttpServletRequest request){
        schoolserviceImp.addschoolservice(schoolname);
        selectschool(request);
        return "r_user/r_school";
    }

    @RequestMapping("/selectschool")
    public String selectschool(HttpServletRequest request){
        String schoolContent="";
        for(School school:schoolserviceImp.selectschoolservice()){
            schoolContent+=school.getName();
            schoolContent+="<br>";
        }
        request.setAttribute("schoolname",schoolContent);
        return "r_user/r_school";
    }
}
