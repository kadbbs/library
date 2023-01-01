package com.yun.mapper;

import com.yun.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface bookxxMapper {
    void deletebook(String bookname);

    void addbook(   @Param("bookname")
                    String bookname,
                 @Param("author")
                 String author,
                 @Param("intro")
                 String intro,
                    @Param("category")
                    String category);
    List<Book> selectbook();
}
