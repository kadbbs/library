package com.yun.service;

import com.yun.pojo.Root;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
public interface rootuserservice {
    List<Root> selectrootpage();
}
