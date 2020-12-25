package com.domain;

import lombok.Data;

import java.util.List;

@Data
public class ExcelWriteItem {

    /**
     * 文件名
     */
    private String filename;

    /**
     * sheet 集合
     */
    private List<ExcelSheet> excelSheet;

    @Data
    public static class ExcelSheet<T> {

        /**
         * sheet 编号
         */
        private int sheetNo;

        /**
         * sheet 名称
         */
        private String sheetName;

        /**
         * sheet 头实体类
         */
        private Class headClazz;

        /**
         * sheet 数据
         */
        private List<T> data;
    }
}
