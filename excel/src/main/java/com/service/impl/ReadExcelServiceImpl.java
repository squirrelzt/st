package com.service.impl;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.fastjson.JSON;
import com.domain.TruckDriver;
import com.service.ReadExcelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 类名称: ReadExcelServiceImpl
 * 类描述: 读取Excel服务接口实现类
 * @author squirrel
 * @date 2019-08-18
 */
@Slf4j
@Service
public class ReadExcelServiceImpl implements ReadExcelService {

    @Override
    public List<Object> readExcel2007(MultipartFile file) throws IOException{
//        String path = ResourceUtils.getURL("").getPath();
//        File tempFile = new File("E:" + File.separator + "tmpfile");
//        file.transferTo(tempFile);
        InputStream inputStream = file.getInputStream();
//        InputStream inputStream = new FileInputStream(tempFile);
        // 表格序号
        int sheetNo = 1;
        // 从第2行开始读取，第1行为表头
        int headLineMun = 1;
        Sheet sheet = new Sheet(sheetNo, headLineMun, TruckDriver.class);
        List<Object> list = EasyExcelFactory.read(inputStream, sheet);
//        List<Object> list = EasyExcelFactory.read(inputStream, new Sheet(1, 1));
        log.info("------------------------");
        log.info(JSON.toJSONString(list));
        return removeDuplicate(list);
    }

    @Override
    public List<Object> readExcel2003(MultipartFile file) throws IOException {
        return test2003(file);
//        List<Object> list = new ArrayList<>();
//        InputStream inputStream = file.getInputStream();
//        AnalysisEventListener listener = new AnalysisEventListener() {
//            @Override
//            public void invoke(Object object, AnalysisContext analysisContext) {
//                System.out.println("当前行："+analysisContext.getCurrentRowNum());
//                System.out.println(object);
//                list.add(object);
//            }
//
//            @Override
//            public void doAfterAllAnalysed(AnalysisContext analysisContext) {
//
//
//            }
//        };
//        ExcelReader excelReader = new ExcelReader(inputStream, ExcelTypeEnum.XLS, null, listener);
//        excelReader.read();
//        return removeDuplicate(list);
    }

    private List<Object> test2003(MultipartFile file) throws IOException {
        InputStream inputStream = new BufferedInputStream(file.getInputStream());
        int sheetNo = 1;
        // 从第2行开始读取，第1行为表头
        int headLineMun = 1;
        Sheet sheet = new Sheet(sheetNo, headLineMun, TruckDriver.class);
        List<Object> list = EasyExcelFactory.read(inputStream, sheet);
        log.info(JSON.toJSONString(list));
        return removeDuplicate(list);
    }
    private List<Object> removeDuplicate(List<Object> originList) {
        List<Object> list = new ArrayList<>();
        if (!originList.isEmpty()) {
            for (Object obj: originList) {
                TruckDriver model = (TruckDriver)obj;
                String truckNumber = model.getTruckNumber() == null ? null: model.getTruckNumber().replaceAll(" ", "").replaceAll("\n", "");
                String traileNumber = model.getTraileNumber() == null ? null: model.getTraileNumber().replaceAll(" ", "").replaceAll("\n", "");
                String driverName = model.getDriverName() == null ? null: model.getDriverName().replaceAll(" ", "").replaceAll("\n", "");
                String driverIdCard = model.getDriverIdCard() == null ? null: model.getDriverIdCard().replaceAll(" ", "").replaceAll("\n", "");
                String driverMobile = model.getDriverMobile() == null ? null: model.getDriverMobile().replaceAll(" ", "").replaceAll("\n", "");
                String planQuantity = model.getPlanQuantity() == null ? null: model.getPlanQuantity().replaceAll(" ", "").replaceAll("\n", "");
                String limitNum = model.getLimitNum() == null ? null: model.getLimitNum().replaceAll(" ", "").replaceAll("\n", "");
                TruckDriver truckDriverExcelModel = new TruckDriver();
                truckDriverExcelModel.setTruckNumber(truckNumber);
                truckDriverExcelModel.setTraileNumber(traileNumber);
                truckDriverExcelModel.setDriverName(driverName);
                truckDriverExcelModel.setDriverIdCard(driverIdCard);
                truckDriverExcelModel.setDriverMobile(driverMobile);
                truckDriverExcelModel.setPlanQuantity(planQuantity);
                truckDriverExcelModel.setLimitNum(limitNum);

                if (Objects.isNull(truckNumber) && Objects.isNull(traileNumber) && Objects.isNull(driverName) && Objects.isNull(driverIdCard) && Objects.isNull(driverMobile) && Objects.isNull(planQuantity) && Objects.isNull(limitNum)) {

                } else {
                    list.add(truckDriverExcelModel);
                }
            }
        }
        return list;
    }
}
