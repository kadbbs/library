package com.yun.service.imp;

import com.yun.mapper.schoolMapper;
import com.yun.pojo.School;
import com.yun.service.schoolservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class schoolserviceImp implements schoolservice {
    @Autowired
    schoolMapper schoolMapper;
    @Override
    public void deleteschoolservice(String name) {
        schoolMapper.deleteschool(name);
    }

    @Override
    public void addschoolservice(String name) {
        schoolMapper.addschool(name);
    }

    @Override
    public List<School> selectschoolservice() {
        return schoolMapper.selectschool();
    }
}
