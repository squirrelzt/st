package com.file.download;

import com.common.FileResponse;
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
public class DownloadController {

    private final DownloadService downloadService;

    public DownloadController(DownloadService downloadService) {
        this.downloadService = downloadService;
    }

    @RequestMapping("/download/ftp")
    public void downloadFtp(HttpServletResponse response) {
        try {
            downloadService.ftpDownload(response);
        } catch (IOException e) {
            LOGGER.error(e.getMessage());
        }
    }

    @RequestMapping("/download/excel")
    public void downloadXlsx(HttpServletResponse response) {
        try {
            downloadService.csvDownload(response);
        } catch (IOException e) {
            LOGGER.error(e.getMessage());
        }
    }
}
