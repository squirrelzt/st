package com.annotation.controller;

import com.annotation.vo.DateVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 类名称: DateController
 * 类描述: 日期格式化
 * @author squirrel
 * @date 2019-04-01
 */
@RestController
@RequestMapping("/date")
public class DateController {

    @RequestMapping("/now")
    public Map<String, Object> getNow() {
        Map<String, Object> result = new HashMap<>(2);

        DateVO vo = new DateVO();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        vo.setGmtCreate(new Date());
        vo.setGmtModified(new Date());

        vo.setGmtCreate8(localDate);
        vo.setGmtModified8(localDate);

        vo.setGmtCreateTime(localDateTime);
        vo.setGmtModifiedTime(localDateTime);

        result.put("now", vo);



        return result;
    }
}
