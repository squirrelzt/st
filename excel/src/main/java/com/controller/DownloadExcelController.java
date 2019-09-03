package com.controller;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Font;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.metadata.TableStyle;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.domain.TruckDriver;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 类名称: DownloadExcelController
 * 类描述: 下载Excel
 */
@Slf4j
@RestController
@RequestMapping("/download")
public class DownloadExcelController {

    @RequestMapping("/excel1")
    public void downloadExcel1(HttpServletRequest request, HttpServletResponse response) {
        try (ServletOutputStream out = response.getOutputStream()) {
            response.setContentType("multipart/form-data");
            response.setCharacterEncoding("utf-8");
            response.setHeader("Content-disposition", "attachment;filename=test.xlsx");
            ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX, false);
            Sheet sheet1 = new Sheet(1, 1);
            sheet1.setSheetName("sheet11");
            writer.write0(getListString(), sheet1);
            writer.finish();
            out.flush();
        } catch (IOException e) {
            log.error("下载Excel失败", e);
        }
    }

    @RequestMapping("/excel")
    public void downloadExcel(HttpServletRequest request, HttpServletResponse response) {
        try (ServletOutputStream out = response.getOutputStream()) {
            response.setContentType("multipart/form-data");
            response.setCharacterEncoding("utf-8");
            response.setHeader("Content-disposition", "attachment;filename=test.xlsx");
            ExcelWriter writer = EasyExcelFactory.getWriter(out);
            Sheet sheet = new Sheet(1, 0, TruckDriver.class);
            TableStyle tableStyle = new TableStyle();
            tableStyle.setTableHeadBackGroundColor(IndexedColors.YELLOW);
            Font font = new Font();
            font.setFontHeightInPoints((short)12);
            tableStyle.setTableContentFont(font);
            Font headFont = new Font();
            headFont.setBold(Boolean.TRUE);
            headFont.setFontHeightInPoints((short)10);
            tableStyle.setTableHeadFont(headFont);
            tableStyle.setTableContentBackGroundColor(IndexedColors.WHITE);
            sheet.setTableStyle(tableStyle);
            sheet.setSheetName("sheet");
            List<TruckDriver> data = getData();
            writer.write(data, sheet);
            writer.finish();
            out.flush();
        } catch (IOException e) {
            log.error("下载Excel失败", e);
        }
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
        truckDriver1.setLimitNum("2019-08-05 14:28:43");
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
