package com.annotation.vo;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * 类名称: DateVO
 * 类描述: 日期VO
 * @squirrel
 * @date 2019-04-01
 */
@Data
public class DateVO {

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;

    /**
     * 创建时间(Java8)
     */
    private LocalDate gmtCreate8;

    /**
     * 修改时间(Java8)
     */
    private LocalDate gmtModified8;

    /**
     * 创建时间(Java8)
     */
    private LocalDateTime gmtCreateTime;

    /**
     * 修改时间(Java8)
     */
    private LocalDateTime gmtModifiedTime;
}
