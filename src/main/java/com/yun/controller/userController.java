package com.yun.controller;

import com.yun.pojo.Notice;
import com.yun.pojo.Stutea;
import com.yun.service.imp.stuteaVerifyserviceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
@Controller
public class userController {
    @Autowired
    stuteaVerifyserviceImp rusi;
    @RequestMapping("/adduser")
    public String add(int id, String name,String account,int pwd ,HttpServletRequest request){
        rusi.adduser(id,name,account,pwd);
        select (request);
        return "r_user/r_user";
    }

    @RequestMapping("/deleteuser")
    public String delete(int id,HttpServletRequest request){

        rusi.deleteuser(id);
        select (request);

        return "r_user/r_user";
    }

    @RequestMapping("/selectuser")//select
    public String select (HttpServletRequest request){

        String contentstr="";
        List<Stutea> userList =rusi.selectstservice();
        for(Stutea stutea:userList){
            contentstr+="用户ID:"+stutea.getId()+"<br>"+"姓名:"+stutea.getName()+"<br>"+"账号"+stutea.getAccount()+"<br>"+"密码:"+stutea.getPwd();
            contentstr+="<br>-------------------------------------<br>";
        }

        request.setAttribute("usercontent", contentstr);
        return "r_user/r_user";
    }
}
