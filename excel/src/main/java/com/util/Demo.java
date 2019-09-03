package com.util;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.metadata.BaseRowModel;
import com.alibaba.excel.metadata.Font;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.metadata.TableStyle;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.domain.TruckDriver;
import org.apache.poi.ss.usermodel.IndexedColors;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {
    public static void main(String[] args) throws IOException {
        write();
//        read();
//        read2003();
    }

    public static void write() throws IOException {
        OutputStream out = new FileOutputStream("E:" + File.separator + "test.xlsx");
        ExcelWriter writer = EasyExcelFactory.getWriter(out);
        //写第一个sheet, sheet1  数据全是List<String> 无模型映射关系
        Sheet sheet1 = new Sheet(1, 3, TruckDriver.class);
        sheet1.setSheetName("第一个sheet");
        TableStyle tableStyle = new TableStyle();
        tableStyle.setTableHeadBackGroundColor(IndexedColors.WHITE);
        tableStyle.setTableContentBackGroundColor(IndexedColors.WHITE);
        Font font = new Font();
        font.setBold(Boolean.FALSE);
        font.setFontHeightInPoints((short)9);

        tableStyle.setTableContentFont(font);
        tableStyle.setTableHeadFont(font);
        sheet1.setTableStyle(tableStyle);

        //设置列宽 设置每列的宽度
        Map columnWidth = new HashMap();
        columnWidth.put(0,10000);columnWidth.put(1,40000);columnWidth.put(2,10000);columnWidth.put(3,10000);
        sheet1.setColumnWidthMap(columnWidth);
//        sheet1.setHead(createTestListStringHead());
        //or 设置自适应宽度
        //sheet1.setAutoWidth(Boolean.TRUE);
        writer.write(getData(), sheet1);
        writer.finish();
        out.close();
    }

    private static List<? extends BaseRowModel> getData() {
        List<TruckDriver> list = new ArrayList<>(2);
        TruckDriver truckDriver1 = new TruckDriver();
        truckDriver1.setTruckNumber("京ZA1001");
        truckDriver1.setTraileNumber("京挂ZA011");
        truckDriver1.setDriverName("张一1");
        truckDriver1.setDriverIdCard("130612198501011001");
        truckDriver1.setDriverMobile("19012345601");
        truckDriver1.setPlanQuantity("1.101");
        truckDriver1.setLimitNum("1");
        list.add(truckDriver1);

        TruckDriver truckDriver2 = new TruckDriver();
        truckDriver2.setTruckNumber("京ZA1002");
        truckDriver2.setTraileNumber("京挂ZA012");
        truckDriver2.setDriverName("张一2");
        truckDriver2.setDriverIdCard("130612198501011002");
        truckDriver2.setDriverMobile("19012345602");
        truckDriver2.setPlanQuantity("2.101");
        truckDriver2.setLimitNum("2");
        list.add(truckDriver2);
        return list;
    }

    public static void read() throws FileNotFoundException {
        File file = new File("E:" + File.separator + "222.xls");
        InputStream inputStream = new FileInputStream(file);
        List<Object> data = EasyExcelFactory.read(inputStream, new Sheet(1, 1, TruckDriver.class));
        System.out.println(data.size());
        System.out.println(data);
    }

    public static void read2003() throws FileNotFoundException {
        List<Object> list =  new ArrayList<>();
        File file = new File("E:" + File.separator + "222.xls");
        InputStream inputStream = new FileInputStream(file);
        AnalysisEventListener listener = new AnalysisEventListener() {
            @Override
            public void invoke(Object object, AnalysisContext analysisContext) {
                System.out.println("当前行："+analysisContext.getCurrentRowNum());
                System.out.println(object);
                list.add(object);
            }

            @Override
            public void doAfterAllAnalysed(AnalysisContext analysisContext) {

            }
        };
        ExcelReader excelReader = new ExcelReader(inputStream, ExcelTypeEnum.XLS, null, listener);
        excelReader.read();
//        List<Object> data = EasyExcelFactory.read(inputStream, new Sheet(1, 1, TruckDriver.class));
//        System.out.println(data.size());
//        System.out.println(data);
        System.out.println(list);
    }
}
