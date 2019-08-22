package com.domain;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;

@Data
public class TruckDriver extends BaseRowModel {

    @ExcelProperty(index = 0)
    private String truckNumber;

    @ExcelProperty(index = 1)
    private String traileNumber;

    @ExcelProperty(index = 5)
    private String planQuantity;

    @ExcelProperty(index = 6)
    private String limitNum;

    @ExcelProperty(index = 2)
    private String driverName;

    @ExcelProperty(index = 3)
    private String driverIdCard;

    @ExcelProperty(index = 4)
    private String driverMobile;
}
