package com.yun.service.imp;

import com.yun.mapper.bookcategoryMapper;
import com.yun.pojo.Bookcategory;
import com.yun.service.bookcategoryservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class bookcategoryserviceImp implements bookcategoryservice{
    @Autowired
    bookcategoryMapper bookcategoryMapper;
    @Override
    public void deletebookcategoryservice(String category) {
        bookcategoryMapper.deletebookcategory(category);
    }
    @Override
    public void addbookcategoryservice(String category) {
        bookcategoryMapper.addbookcategory(category);
    }
    @Override
    public List< Bookcategory> selectbookcategoryservice() {

        return bookcategoryMapper.selectbookcategory();
    }
}
