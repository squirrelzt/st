package com.controller;

import com.service.ReadExcelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * 类名称: UploadExcelController
 * 类描述: 上传Excel控制器
 * @author squirrel
 * @date 2019-08-27
 */
@Slf4j
@RestController
@RequestMapping("/upload")
public class UploadExcelController {

    private ReadExcelService readExcelService;

    public UploadExcelController(ReadExcelService readExcelService) {
        this.readExcelService = readExcelService;
    }

    /**
     * 上传2007 xlsx
     * @param file 上传文件
     * @return 文件内容
     */
    @RequestMapping("/excel2007")
    public List<Object> uploadExcel2007(@RequestParam("uploadFile") MultipartFile file) {
        try {
            return readExcelService.readExcel2007(file);
        } catch (IOException e) {
            log.error("", e);
            return null;
        }
    }

    @RequestMapping("/excel2003")
    public List<Object> uploadExcel2003(@RequestParam("uploadFile") MultipartFile file) {
        try {
            return readExcelService.readExcel2003(file);
        } catch (IOException e) {
            log.error("", e);
            return null;
        }
    }

//    @RequestMapping("/excel")
//    public List<Object> uploadExcel(@RequestParam("uploadFile") MultipartFile file) {
//        try {
//            EasyExcel.read(file.getInputStream(), TruckDriver.class, new UploadDataListener()).sheet().doRead();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
