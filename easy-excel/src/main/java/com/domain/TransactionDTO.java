package com.domain;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;


@Data
@ContentRowHeight(20)
@HeadRowHeight(20)
public class TransactionDTO {

    /**
     * id
     */
    @ExcelProperty(index = 21, value = " ")
    private String ids;
    /**
     * 序号
     */
    @ColumnWidth(6)
    @ExcelProperty(index = 0, value = "序号")
    private String id;

    /**
     * 仓库名称
     */
    @ColumnWidth(12)
    @ExcelProperty(index = 1, value = "仓库名称")
    private String siteName;

    /**
     * 是否已锁定（1:锁定; 0:未锁定）
     */
    @ColumnWidth(8)
    @ExcelProperty(index = 2, value = "锁定")
    private String isHold;

    /**
     * 业务类型（in: 转入; out: 转出）
     */
    @ColumnWidth(10)
    @ExcelProperty(index = 3, value = "业务类型")
    private String businessType;

    /**
     * （委托提货单号）客户提单号
     */
    @ColumnWidth(18)
    @ExcelProperty(index = 4, value = "委托提货单号")
    private String ownerBillno;

    /**
     * 商品ID（品名）
     */
    @ColumnWidth(15)
    @ExcelProperty(index = 5, value = "品名")
    private String goodsName;

    /**
     * 提单数量（吨）（计划数量）
     */
    @ColumnWidth(15)
    @ExcelProperty(index = 6, value = "提单数量（吨）")
    private String planQuantity;

    /**
     * 转出方（转出方企业名称）
     */
    @ColumnWidth(30)
    @ExcelProperty(index = 7, value = "转出方")
    private String ownerName;

    /**
     * 转入方（转入方企业名称）
     */
    @ColumnWidth(30)
    @ExcelProperty(index = 8, value = "转入方")
    private String receiveName;

    /**
     * 罐号
     */
    @ColumnWidth(20)
    @ExcelProperty(index = 9, value = "罐号")
    private String location;

    /**
     * 有效期至
     */
    @ColumnWidth(20)
    @ExcelProperty(index = 10, value = "有效期至")
    private String validate;

    /**
     * 装车打封条
     */
    @ColumnWidth(10)
    @ExcelProperty(index = 11, value = "装车打封条")
    private String loadingSeals;

    /**
     * 现场支付费用
     */
    @ColumnWidth(20)
    @ExcelProperty(index = 12, value = "现场支付费用")
    private String onSiteFee;

    /**
     * 制单人
     */
    @ColumnWidth(10)
    @ExcelProperty(index = 13, value = "制单人")
    private String creator;

    /**
     * 制单时间
     */
    @ColumnWidth(20)
    @ExcelProperty(index = 14, value = "制单时间", format = "yyyy-MM-dd HH:mm:ss")
    private String createDate;

    /**
     * 审核人
     */
    @ColumnWidth(10)
    @ExcelProperty(index = 15, value = "审核人")
    private String checkor;
    /**
     * 审核时间
     */
    @ColumnWidth(20)
    @ExcelProperty(index = 16, value = "审核时间", format = "yyyy-MM-dd HH:mm:ss")
    private String checkDate;

    /**
     * 备注
     */
    @ColumnWidth(40)
    @ExcelProperty(index = 17, value = "备注")
    private String billMemo;

    @ExcelProperty(index = 18, value = "  ")
    private String hello;

    @ExcelProperty(index = 19, value = " ")
    private String world;
}
