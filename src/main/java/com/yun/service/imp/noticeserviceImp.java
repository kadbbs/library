package com.yun.service.imp;

import com.yun.mapper.noticeMapper;
import com.yun.pojo.Notice;
import com.yun.service.noticeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class noticeserviceImp implements noticeservice {
    @Autowired
    noticeMapper noticeMapper;
    @Override
    public void addnoticeservoce(int addid,String time,String noticeNews) {
        noticeMapper.addnotice(addid,time,noticeNews);
    }

    @Override
    public void deletenoticeservice(int noticeid) {
        noticeMapper.deletenotice(noticeid);
    }

    @Override
    public List<Notice> selectnoticeservice() {
        return noticeMapper.selectnotice();
    }
}
