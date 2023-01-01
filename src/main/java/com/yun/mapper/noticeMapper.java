package com.yun.mapper;

import com.yun.pojo.Notice;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface noticeMapper {
    void addnotice(@Param("addid")
                    int addid,
                   @Param("time")
                   String time,
                   @Param("noticeNews")
                   String noticeNews);

    void deletenotice(int noticeid);

    List<Notice> selectnotice();
}
