package com.listener;

import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.write.handler.CellWriteHandler;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteTableHolder;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.util.List;
import java.util.Objects;

@Slf4j
public class DisplayColumnWriteHandler implements CellWriteHandler {

    /**
     * 要隐藏的列index
     */
    private List<Integer> hiddenColumnIndex;

    public DisplayColumnWriteHandler(List<Integer> hiddenColumnIndex) {
        this.hiddenColumnIndex = hiddenColumnIndex;
    }

    @Override
    public void beforeCellCreate(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder, Row row, Head head, int i, boolean b) {

    }

    @Override
    public void afterCellCreate(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder, CellData cellData, Cell cell, Head head, int i, boolean b) {
//        if (head.getColumnIndex() == 18 || head.getColumnIndex() == 19) {
//            if (!Objects.isNull(cellData)) {
//                cellData.setStringValue("");
//            }
//            cell.setCellValue("");
//        }
        if (!hiddenColumnIndex.isEmpty()) {
            for (Integer index : hiddenColumnIndex) {
                if (head.getColumnIndex().equals(index)) {
                    if (!Objects.isNull(cellData)) {
                        cellData.setStringValue("");
                    }
                    cell.setCellValue("");
                }
            }
        }
    }
}
