package com.yun.service;

import com.yun.pojo.Bookcategory;

import java.util.List;

public interface bookcategoryservice {
    void deletebookcategoryservice(String category);
    void addbookcategoryservice(String category);
    List<Bookcategory> selectbookcategoryservice();
}
