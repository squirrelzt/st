package com.file.download.service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 类名称: DownloadService
 * 类描述: 下载服务接口
 * @author squirrel
 * @date 2019-02-25
 */
public interface DownloadService {

    /**
     * 文件类型数据下载(txt,pdf,png,jpg)
     * @param response {@link HttpServletResponse}
     * @throws IOException 抛出异常
     */
    void downloadFile(HttpServletResponse response) throws IOException;
}
