package com.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface ReadExcelService {

    Object readExcel(MultipartFile file) throws IOException;
}
