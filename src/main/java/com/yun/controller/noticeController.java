package com.yun.controller;

import com.yun.pojo.Notice;
import com.yun.service.imp.noticeserviceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

@Controller
public class noticeController {

    @Autowired
    noticeserviceImp noticeserviceImp;
    @RequestMapping("/add")
    public String add(int addid,String content,HttpServletRequest request){
        SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String time=format.format(Calendar.getInstance().getTime());
        noticeserviceImp.addnoticeservoce(addid,time,content);
        select (request);
        return "r_user/r_notice";
    }

    @RequestMapping("/delete")
    public String delete(int id,HttpServletRequest request){

        noticeserviceImp.deletenoticeservice(id);
        select (request);

        return "r_user/r_notice";
    }

    @RequestMapping("/notice")//select
    public String select (HttpServletRequest request){

        String contentstr="";
        List<Notice> noticeList =noticeserviceImp.selectnoticeservice();
        for(Notice notice:noticeList){
            contentstr+="公告ID:"+notice.getId()+"<br>"+"\n发布时间:"+notice.getTime()+"<br>"+"公告内容："+"<br>"+notice.getContent();
            contentstr+="<br>-------------------------------------<br>";
        }

        request.setAttribute("content", contentstr);
        return "r_user/r_notice";
    }
    @RequestMapping("/notice1")
    public String rfun_re_notice(){

        return "r_user/r_notice";
    }


}
