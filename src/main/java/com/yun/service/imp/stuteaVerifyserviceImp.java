package com.yun.service.imp;

import com.yun.mapper.stuteaMapper;
import com.yun.pojo.Stutea;
import com.yun.service.stuteaVerifyservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class stuteaVerifyserviceImp implements stuteaVerifyservice {
    @Autowired
    stuteaMapper stuteaMapper;
    @Override
    public List<Stutea> selectstservice() {
        return stuteaMapper.selectst();
    }

    @Override
    public void adduser(int id, String name, String account, int pwd) {
        stuteaMapper.adduser(id,name,account,pwd);
    }

    @Override
    public void deleteuser(int id) {
        stuteaMapper.deleteuser(id);

    }
}
