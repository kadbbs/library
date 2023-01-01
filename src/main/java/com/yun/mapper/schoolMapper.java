package com.yun.mapper;

import com.yun.pojo.School;

import java.util.List;

public interface schoolMapper {
    void deleteschool(String dname);
    void addschool(String aname);
    List<School> selectschool();
}
