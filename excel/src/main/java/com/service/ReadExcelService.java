package com.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * 类名称: ReadExcelService
 * 类描述: 读取Excel服务接口
 * @author squirrel
 * @date 2019-08-18
 */
public interface ReadExcelService {

    /**
     * 读取2007 xlsx
     * @param file 上传文件
     * @return 文件内容
     * @throws IOException 异常
     */
    List<Object> readExcel2007(MultipartFile file) throws IOException;
}
