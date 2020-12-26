package com.domain.write;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.Data;

@Data
@ContentRowHeight(20)
@HeadRowHeight(20)
public class SecondSheetWriteItem {

    @ColumnWidth(20)
    @ExcelProperty(index = 0, value = "序号")
    private String id;

    @ColumnWidth(20)
    @ExcelProperty(index = 1, value = "姓名")
    private String name;

    @ColumnWidth(20)
    @ExcelProperty(index = 2, value = "公司")
    private String company;
}
