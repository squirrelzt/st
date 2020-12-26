package com.domain.read;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.ArrayList;
import java.util.List;

public class SecondSheetItemListener extends AnalysisEventListener<SecondSheetItem> {

    private final List<SecondSheetItem> list;

    public SecondSheetItemListener() {
        list = new ArrayList<>();
    }
    @Override
    public void invoke(SecondSheetItem secondSheetItem, AnalysisContext analysisContext) {
        list.add(secondSheetItem);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }

    public List<SecondSheetItem> getSecondSheetData() {
        return list;
    }
}
