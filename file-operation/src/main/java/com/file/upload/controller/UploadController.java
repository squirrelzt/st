package com.file.upload.controller;

import com.file.upload.service.UploadService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author squirrel
 * @date 2019-02-25
 */
@RestController
public class UploadController {

    private final UploadService uploadService;

    public UploadController(UploadService uploadService) {
        this.uploadService = uploadService;
    }

    @RequestMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file) {
        uploadService.upload(file);
        return "upload success";
    }
}
