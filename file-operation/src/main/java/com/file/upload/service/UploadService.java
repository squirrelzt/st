package com.file.upload.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author squirrel
 * @date 2019-02-25
 */
public interface UploadService {

    /**
     * 上传文件
     * @param file {@link MultipartFile}
     */
    void upload(MultipartFile file) throws IOException;
}
