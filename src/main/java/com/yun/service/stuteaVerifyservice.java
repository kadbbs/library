package com.yun.service;

import com.yun.pojo.Stutea;

import java.util.List;

public interface stuteaVerifyservice {
    List<Stutea> selectstservice();
    void adduser(int id,String name,String account,int pwd);
    void deleteuser(int id);
}
