package com.yun.service;

import com.yun.pojo.Notice;

import java.util.List;

public interface noticeservice {
    void addnoticeservoce(int addid,String time,String noticeNews);

    void deletenoticeservice(int noticeid);

    List<Notice> selectnoticeservice();
}
