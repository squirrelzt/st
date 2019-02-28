package com.file.upload.service.impl;

import com.file.upload.service.UploadService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author squirrel
 * @date 2019-02-25
 */
@Slf4j
@Service
public class UploadServiceImpl implements UploadService {

    @Value("${upload.upload-path}")
    private String uploadPath;

    @Override
    public void upload(MultipartFile file) throws IOException {
        String filename = file.getOriginalFilename();
        String path = ResourceUtils.getURL("").getPath() + File.separator + uploadPath + File.separator + filename;
        File dest = new File(path);
        try {
            file.transferTo(dest);
        } catch (IOException e) {
            LOGGER.error("" + e);
            throw new IOException(e);
        }

    }
}
