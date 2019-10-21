package com.listener;

import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.write.merge.AbstractMergeStrategy;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;

public class MyMergeStrategy extends AbstractMergeStrategy {

    /**
     * 要合并的是第几行
     */
    private int mergeRowIndex;

    /**
     * 属性个数
     */
    private int columnLength;

    public MyMergeStrategy() {}

    public MyMergeStrategy(int mergeRowIndex, int columnLength) {
        this.mergeRowIndex = mergeRowIndex;
        this.columnLength = columnLength;
    }

    @Override
    protected void merge(Sheet sheet, Cell cell, Head head, int relativeRowIndex) {
        if (relativeRowIndex == mergeRowIndex - 1 && head.getColumnIndex() == columnLength - 1) {
            CellRangeAddress cellRangeAddress = new CellRangeAddress(mergeRowIndex, mergeRowIndex, 0, columnLength);
            sheet.addMergedRegion(cellRangeAddress);
        }
    }
}
