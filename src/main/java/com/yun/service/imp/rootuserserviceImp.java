package com.yun.service.imp;

import com.yun.mapper.rootMapper;
import com.yun.pojo.Root;
import com.yun.service.rootuserservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class rootuserserviceImp implements rootuserservice {
    @Autowired
    rootMapper rm;
    @Override
    public List<Root> selectrootpage() {
        return rm.selectrootuser();
    }
}
