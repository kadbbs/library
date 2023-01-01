package com.yun.mapper;

import com.yun.pojo.Stutea;

import java.util.List;

public interface stuteaMapper {
    List<Stutea> selectst();
    void adduser(int id,String name,String account,int pwd);
    void deleteuser(int id);
}
