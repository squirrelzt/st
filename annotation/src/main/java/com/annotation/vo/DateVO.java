package com.annotation.vo;

import lombok.Data;

import java.util.Date;

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
}
