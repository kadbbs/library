package com.yun.service;

import com.yun.pojo.Book;

import java.util.List;

public interface bookxxservice {
    void deletebookservice(String bookname);

    void addbookservice(String bookname,String author,String intro,String category);
    List<Book> selectbookservice();
}
