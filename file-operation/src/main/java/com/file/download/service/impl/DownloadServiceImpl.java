package com.file.download.service.impl;

import com.file.download.service.DownloadService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * 类名称: DownloadServiceImpl
 * 类描述: 下载服务接口实现类
 * @author squirrel
 * @date 2019-02-25
 */
@Slf4j
@Service
public class DownloadServiceImpl implements DownloadService {

    @Value("${download.file-path}")
    private String filePath;

    /**
     * 文件类型数据下载(txt,pdf,png,jpg)
     * @param response {@link HttpServletResponse}
     * @throws IOException 抛出异常
     */
    @Override
    public void downloadFile(HttpServletResponse response) throws IOException {
        File file = new File(filePath);
        byte[] buffer = new byte[1024];
        try (InputStream in = new FileInputStream(file); OutputStream out = response.getOutputStream()) {
            response.setHeader("Content-Type","application/octet-stream");
            response.setHeader("Content-Disposition", "attachment; filename=" +
                    new String(file.getName().getBytes("ISO-8859-1"), "UTF-8"));
            int length = in.read(buffer);
            while (length != -1) {
                out.write(buffer, 0, length);
                length = in.read(buffer);
            }
            response.flushBuffer();
        } catch (IOException e) {
            LOGGER.error(e.getMessage());
            throw new IOException(e.getMessage());
        }
    }
}
