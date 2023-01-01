package com.yun.controller;

import com.yun.pojo.Book;
import com.yun.pojo.Notice;
import com.yun.service.imp.bookxxserviceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class bookxxController {

    @Autowired
    bookxxserviceImp bookxxserviceImp;

    @RequestMapping("/deletebook")
    public String deletebook(String bookname,HttpServletRequest request){
        bookxxserviceImp.deletebookservice(bookname);
        selectbook(request);
        return "r_user/r_bookxx";
    }

    @RequestMapping("/addbook")
    public String addbook(String bookname,String author,String intro,String category,HttpServletRequest request){
        bookxxserviceImp.addbookservice(bookname,author,intro,category);
        selectbook(request);
        return "r_user/r_bookxx";
    }
    @RequestMapping("/selectbook")
    public String selectbook(HttpServletRequest request){
        String bookstr="";
        for(Book book:bookxxserviceImp.selectbookservice()){
            bookstr+="图书名称:"+book.getBookname()+"<br>"+"图书作者:"+book.getAuthor()+"<br>"+"图书简介:"+book.getIntro()+"<br>"+"图书简介"+book.getCategory();
            bookstr+="<br>-------------------------------------<br>";
        }

        request.setAttribute("bookcontent", bookstr);
        return "r_user/r_bookxx";

    }
}
