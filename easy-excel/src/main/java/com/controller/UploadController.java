package com.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import com.alibaba.excel.read.builder.ExcelReaderSheetBuilder;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.domain.TruckDriver;
import com.listener.TruckDriverListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/upload")
public class UploadController {

    @RequestMapping("/excel")
    public List uploadExcel(@RequestParam("uploadFile")MultipartFile file) {
        try {
//            ExcelReaderBuilder builder = EasyExcel.read(file.getInputStream());
//            builder.headRowNumber(1);
//            ExcelReaderSheetBuilder sheetBuilder = builder.sheet();
//            ReadSheet readSheet = sheetBuilder.build();
//            readSheet.getCustomConverterList();
            EasyExcel.read(file.getInputStream(), TruckDriver.class, new TruckDriverListener()).sheet().doRead();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
