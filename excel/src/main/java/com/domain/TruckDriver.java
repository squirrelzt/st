package com.domain;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;

@Data
public class TruckDriver extends BaseRowModel {

    @ExcelProperty(value = "车牌号", index = 0)
    private String truckNumber;

    @ExcelProperty(value = "挂车号", index = 1)
    private String traileNumber;

    @ExcelProperty(value = "司机姓名", index = 2)
    private String driverName;

    @ExcelProperty(value = "身份证号", index = 3)
    private String driverIdCard;

    @ExcelProperty(value = "手机号码", index = 4)
    private String driverMobile;

    @ExcelProperty(value = "单车提货量（吨）", index = 5)
    private String planQuantity;

    @ExcelProperty(value = "允许提货次数", index = 6)
    private String limitNum;
}
