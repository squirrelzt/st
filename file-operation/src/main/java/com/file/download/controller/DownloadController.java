package com.file.download.controller;

import com.file.download.service.DownloadService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 类名称: DownloadController
 * 类描述: 下载
 * @author squirrel
 * @date 2019-02-25
 */
@Slf4j
@RestController
@RequestMapping("/download")
public class DownloadController {

    private final DownloadService downloadService;

    public DownloadController(DownloadService downloadService) {
        this.downloadService = downloadService;
    }

    /**
     * 文件类型数据下载(txt,pdf,png,jpg,xlsx,xls,csv)
     * @param response {@link HttpServletResponse}
     */
    @RequestMapping("/file")
    public void downloadFile(HttpServletResponse response) {
        try {
            downloadService.downloadFile(response);
        } catch (IOException e) {
            LOGGER.error(e.getMessage());
        }
    }
}
