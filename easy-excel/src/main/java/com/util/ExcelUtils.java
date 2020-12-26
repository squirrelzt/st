package com.util;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.style.WriteCellStyle;
import com.alibaba.excel.write.metadata.style.WriteFont;
import com.alibaba.excel.write.style.HorizontalCellStyleStrategy;
import com.domain.ExcelWriteItem;
import com.domain.read.*;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;

public class ExcelUtils {

    public static void write(HttpServletResponse response, ExcelWriteItem item) throws IOException {
        setResponse(response, item.getFilename());

        WriteCellStyle headerStyle = new WriteCellStyle();
        setHeaderStyle(headerStyle);

        WriteCellStyle contentStyle = new WriteCellStyle();
        setContentStyle(contentStyle);

        HorizontalCellStyleStrategy styleStrategy = new HorizontalCellStyleStrategy(headerStyle, contentStyle);

        ExcelWriter excelWriter = null;
        try {
            excelWriter = EasyExcel.write(response.getOutputStream()).build();
            for (ExcelWriteItem.ExcelSheet sheet : item.getExcelSheet()) {
                WriteSheet writeSheet = EasyExcel.writerSheet(sheet.getSheetNo(), sheet.getSheetName()).registerWriteHandler(styleStrategy).head(sheet.getHeadClazz()).build();
                excelWriter.write(sheet.getData(), writeSheet);
            }
        } finally {
            if (excelWriter != null) {
                excelWriter.finish();
            }
        }
    }

    public static ReadItem read(MultipartFile file) throws IOException {
        ReadItem result = new ReadItem();
        ExcelReader excelReader = null;
        try {
            excelReader = EasyExcel.read(file.getInputStream()).build();
            for (int i = 0; i < 2; i++) {
                if (i == 0) {
                    FirstSheetItemListener listener = new FirstSheetItemListener();
                    ReadSheet readSheet = EasyExcel.readSheet(i).head(FirstSheetItem.class).registerReadListener(listener).build();
                    excelReader.read(readSheet);
                    result.setFirstSheetList(listener.getFirstSheetData());
                } else if (i == 1) {
                    SecondSheetItemListener listener = new SecondSheetItemListener();
                    ReadSheet readSheet = EasyExcel.readSheet(i).head(SecondSheetItem.class).build();
                    excelReader.read(readSheet);
                    result.setSecondSheetList(listener.getSecondSheetData());
                }
            }
        } finally {
            if (excelReader != null) {
                excelReader.finish();
            }
        }
        return result;
    }

    /**
     * 设置返回值类型和文件名
     * @param response {@link HttpServletResponse}
     * @param filename 文件名
     */
    private static void setResponse(HttpServletResponse response, String filename) {
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-disposition", "attachment;filename=" + filename + ".xlsx");
    }

    /**
     * 设header样式
     * @param headWriteCellStyle {@link WriteCellStyle}
     */
    private static void setHeaderStyle(WriteCellStyle headWriteCellStyle) {
        // 背景设置为红色
        headWriteCellStyle.setFillForegroundColor(IndexedColors.WHITE.getIndex());
        WriteFont headWriteFont = new WriteFont();
        headWriteFont.setFontName(HSSFFont.FONT_ARIAL);
        headWriteFont.setFontHeightInPoints((short)9);
        headWriteFont.setBold(Boolean.FALSE);
        headWriteCellStyle.setWriteFont(headWriteFont);
//        headWriteCellStyle.setBottomBorderColor(HSSFColor.toHSSFColor(Color).index);
//        headWriteCellStyle.setBorderBottom(BorderStyle.NONE);
        headWriteCellStyle.setTopBorderColor(HSSFColor.HSSFColorPredefined.GREY_25_PERCENT.getIndex());
        headWriteCellStyle.setRightBorderColor(HSSFColor.HSSFColorPredefined.GREY_25_PERCENT.getIndex());
        headWriteCellStyle.setBottomBorderColor(HSSFColor.HSSFColorPredefined.GREEN.getIndex());
        headWriteCellStyle.setLeftBorderColor(HSSFColor.HSSFColorPredefined.GREY_25_PERCENT.getIndex());
    }

    /**
     * 设置内容样式
     * @param contentWriteCellStyle {@link WriteCellStyle}
     */
    private static void setContentStyle(WriteCellStyle contentWriteCellStyle) {
        // 这里需要指定 FillPatternType 为FillPatternType.SOLID_FOREGROUND 不然无法显示背景颜色.头默认了 FillPatternType所以可以不指定
        contentWriteCellStyle.setFillPatternType(FillPatternType.SOLID_FOREGROUND);
        // 背景颜色
        contentWriteCellStyle.setFillForegroundColor(IndexedColors.WHITE.getIndex());
        WriteFont contentWriteFont = new WriteFont();
        contentWriteFont.setFontName(HSSFFont.FONT_ARIAL);
        // 字体大小
        contentWriteFont.setFontHeightInPoints((short)9);
        contentWriteFont.setBold(Boolean.FALSE);
        contentWriteCellStyle.setWriteFont(contentWriteFont);
        contentWriteCellStyle.setHorizontalAlignment(HorizontalAlignment.CENTER);
        contentWriteCellStyle.setBorderBottom(BorderStyle.THIN);
        contentWriteCellStyle.setBorderRight(BorderStyle.THIN);
        contentWriteCellStyle.setBorderLeft(BorderStyle.THIN);
        contentWriteCellStyle.setBorderTop(BorderStyle.THIN);
        contentWriteCellStyle.setTopBorderColor(HSSFColor.HSSFColorPredefined.GREY_25_PERCENT.getIndex());
        contentWriteCellStyle.setRightBorderColor(HSSFColor.HSSFColorPredefined.GREY_25_PERCENT.getIndex());
        contentWriteCellStyle.setBottomBorderColor(HSSFColor.HSSFColorPredefined.GREY_25_PERCENT.getIndex());
        contentWriteCellStyle.setLeftBorderColor(HSSFColor.HSSFColorPredefined.GREY_25_PERCENT.getIndex());
    }
}
