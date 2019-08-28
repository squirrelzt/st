package com.service.impl;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.fastjson.JSON;
import com.domain.TruckDriver;
import com.service.ReadExcelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

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
    public Object readExcel2007(MultipartFile file) throws IOException{
        InputStream inputStream = file.getInputStream();
        // 表格序号
        int sheetNo = 1;
        // 从第2行开始读取，第1行为表头
        int headLineMun = 1;
        Sheet sheet = new Sheet(sheetNo, headLineMun, TruckDriver.class);
        List<Object> data = EasyExcelFactory.read(inputStream, sheet);
        log.info("------------------------");
        log.info(JSON.toJSONString(data));
        return data;
    }
}
