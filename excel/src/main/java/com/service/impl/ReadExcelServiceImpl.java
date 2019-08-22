package com.service.impl;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.metadata.Sheet;
import com.domain.TruckDriver;
import com.service.ReadExcelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Slf4j
@Service
public class ReadExcelServiceImpl implements ReadExcelService {

    @Override
    public Object readExcel(MultipartFile file) throws IOException{
        InputStream inputStream = file.getInputStream();
        List<Object> data = EasyExcelFactory.read(inputStream, new Sheet(1, 1, TruckDriver.class));
        return data;
    }
}
