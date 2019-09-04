package com.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson.JSON;
import com.domain.TruckDriver;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class TruckDriverListener extends AnalysisEventListener<TruckDriver> {
    /**
     * 每隔5条存储数据库，实际使用中可以3000条，然后清理list ，方便内存回收
     */
    private static final int BATCH_COUNT = 5;

    List<TruckDriver> list = new ArrayList<>();


    @Override
    public void invoke(TruckDriver truckDriver, AnalysisContext analysisContext) {
        list.add(truckDriver);
//        if (list.size() >= BATCH_COUNT) {
//            saveData();
//            list.clear();
//        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        saveData();
        log.info("所有数据解析完成！");
    }

    /**
     * 加上存储数据库
     */
    private void saveData() {
//        log.info("{}条数据，开始存储数据库！", list.size());
//        log.info("存储数据库成功！");
        for (TruckDriver truckDriver : list) {
            log.info(JSON.toJSONString(truckDriver));
        }
    }
}
