package com.domain.read;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.ArrayList;
import java.util.List;

public class FirstSheetItemListener extends AnalysisEventListener<FirstSheetItem> {

    public final List<FirstSheetItem> list;

    public FirstSheetItemListener() {
        list = new ArrayList<>();
    }
    @Override
    public void invoke(FirstSheetItem firstSheetItem, AnalysisContext analysisContext) {
        list.add(firstSheetItem);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }

    public List<FirstSheetItem> getFirstSheetData() {
        return list;
    }
}
