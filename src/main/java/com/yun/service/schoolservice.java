package com.yun.service;

import com.yun.pojo.School;

import java.util.List;

public interface schoolservice {
    void deleteschoolservice(String name);
    void addschoolservice(String name);
    List<School> selectschoolservice();
}
