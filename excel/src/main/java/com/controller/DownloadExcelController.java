package com.controller;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.BaseRowModel;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.domain.TruckDriver;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/download")
public class DownloadExcelController {

    @RequestMapping("/excel1")
    public void downloadExcel1(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ServletOutputStream out = response.getOutputStream();
        response.setContentType("multipart/form-data");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-disposition", "attachment;filename=test.xlsx");
        ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX, false);
//        String fileName = new String(("UserInfo " + new SimpleDateFormat("yyyy-MM-dd").format(new Date()))
//                .getBytes(), "UTF-8");
        Sheet sheet1 = new Sheet(1, 1);
        sheet1.setSheetName("sheet11");
        writer.write0(getListString(), sheet1);

//        List<? extends BaseRowModel> data = getData();
//        writer.write(data, sheet1);
        writer.finish();

        out.flush();
    }

    @RequestMapping("/excel")
    public void downloadExcel(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ServletOutputStream out = response.getOutputStream();
        response.setContentType("multipart/form-data");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-disposition", "attachment;filename=test.xlsx");
//        ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX, false);
        ExcelWriter writer = EasyExcelFactory.getWriter(out);
//        String fileName = new String(("UserInfo " + new SimpleDateFormat("yyyy-MM-dd").format(new Date()))
//                .getBytes(), "UTF-8");
        Sheet sheet1 = new Sheet(1, 0, TruckDriver.class);
        sheet1.setSheetName("sheet");
//        writer.write0(getListString(), sheet1);

        List<TruckDriver> data = getData();
        writer.write(data, sheet1);
        writer.finish();

        out.flush();
    }

    private List<List<String>> getListString() {
        List<List<String>> listAll = new ArrayList<>(5);
        List<String> list = new ArrayList<>(5);
        list.add("1111111");
        list.add("222222");
        list.add("3333333");
        list.add("444444444");
        list.add("5555555");
        listAll.add(list);
        return listAll;
    }

    private List<TruckDriver> getData() {
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
}
