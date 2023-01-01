package com.yun.mapper;

import com.yun.pojo.Bookcategory;
import com.yun.pojo.School;

import java.util.List;

public interface bookcategoryMapper {
    void deletebookcategory(String dcategory);
    void addbookcategory(String acategory);
    List<Bookcategory> selectbookcategory();
}
