package com.yun.service.imp;

import com.yun.mapper.bookxxMapper;
import com.yun.pojo.Book;
import com.yun.service.bookxxservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class bookxxserviceImp implements bookxxservice {

    @Autowired
    bookxxMapper bookxxMapper;
    @Override
    public void deletebookservice(String bookname) {
        bookxxMapper.deletebook(bookname);
    }

    @Override
    public void addbookservice(String bookname, String author, String intro,String category) {
        bookxxMapper.addbook(bookname,author,intro,category);
    }

    @Override
    public List<Book> selectbookservice() {
        return bookxxMapper.selectbook();
    }
}
