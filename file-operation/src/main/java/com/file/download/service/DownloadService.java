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


    void ftpDownload(HttpServletResponse response) throws IOException;

    void csvDownload(HttpServletResponse response) throws IOException;
}
