package com.file.download;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * 类名称: DownloadController
 * 类描述: 下载
 * @author squirrel
 * @date 2019-02-25
 */
@RestController
public class DownloadController {

    @Value("${download.pdf-path}")
    private String pdfPath;

    @RequestMapping("/download")
    public void download(HttpServletResponse response) {
//        File file = new File("/doc/Java_manual.pdf");
        File file = new File(pdfPath);
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
            e.printStackTrace();
        }
    }
}
