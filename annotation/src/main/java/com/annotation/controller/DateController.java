package com.annotation.controller;

import com.annotation.vo.DateVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/date")
public class DateController {

    @RequestMapping("/now")
    public Map<String, Object> getNow() {
        Map<String, Object> result = new HashMap<>(2);
        DateVO vo = new DateVO();
        vo.setGmtCreate(new Date());
        vo.setGmtModified(new Date());
        result.put("now", vo);
        return result;
    }
}
