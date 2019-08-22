package com.controller;

import com.service.ReadExcelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Slf4j
@RestController
@RequestMapping("/upload")
public class UploadExcelController {

    private ReadExcelService readExcelService;

    public UploadExcelController(ReadExcelService readExcelService) {
        this.readExcelService = readExcelService;
    }

    @RequestMapping("/excel")
    public Object uploadExcel(@RequestParam("uploadFile") MultipartFile file) {
        try {
            return readExcelService.readExcel(file);
        } catch (IOException e) {
            log.error("", e);
            return "error";
        }
    }
}
