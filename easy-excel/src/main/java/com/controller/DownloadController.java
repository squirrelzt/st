package com.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.write.merge.LoopMergeStrategy;
import com.alibaba.excel.write.metadata.style.WriteCellStyle;
import com.alibaba.excel.write.metadata.style.WriteFont;
import com.alibaba.excel.write.style.HorizontalCellStyleStrategy;
import com.domain.TransactionDTO;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/download")
public class DownloadController {

    @RequestMapping("/excel")
    public void download(HttpServletResponse response) throws IOException {
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-disposition", "attachment;filename=demo.xlsx");

        // 头的策略
        WriteCellStyle headWriteCellStyle = new WriteCellStyle();
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
// 内容的策略
        WriteCellStyle contentWriteCellStyle = new WriteCellStyle();
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
        HorizontalCellStyleStrategy horizontalCellStyleStrategy =
                new HorizontalCellStyleStrategy(headWriteCellStyle, contentWriteCellStyle);
//        LoopMergeStrategy loopMergeStrategy = new LoopMergeStrategy(2, 0);
        EasyExcel.write(response.getOutputStream(), TransactionDTO.class).registerWriteHandler(horizontalCellStyleStrategy).sheet("模板").doWrite(getData());

    }

    private List<TransactionDTO> getData() {
        List<TransactionDTO> list = new ArrayList<>(3);
        TransactionDTO dto1 = new TransactionDTO();
        dto1.setId("1");
        dto1.setSiteName("东洲石化");
        dto1.setIsHold("是");
        dto1.setBusinessType("转入");
        dto1.setOwnerBillno("201908051053588940");
        dto1.setGoodsName("混合芳烃");
        dto1.setPlanQuantity("0.100");
        dto1.setOwnerName("厦门象屿物流集团有限责任公司");
        dto1.setReceiveName("中山市正群化工贸易有限公司");
        dto1.setLocation("T1101");
        dto1.setValidate("2019-06-13 23:59:00.0");
        dto1.setLoadingSeals("是");
        dto1.setOnSiteFee("封条费/装车过磅费");
        dto1.setCreator("吴高亮");
        dto1.setCreateDate("2019-06-12 12:27:25");
        dto1.setCheckor("王晓明");
        dto1.setCheckDate("2019-06-20 19:14:31");
        dto1.setBillMemo("111111");
        list.add(dto1);

        TransactionDTO dto2 = new TransactionDTO();
        dto2.setId("2");
        dto2.setSiteName("东洲石化");
        dto2.setIsHold("是");
        dto2.setBusinessType("转入");
        dto2.setOwnerBillno("201908051053588940");
        dto2.setGoodsName("混合芳烃");
        dto2.setPlanQuantity("0.100");
        dto2.setOwnerName("厦门象屿物流集团有限责任公司");
        dto2.setReceiveName("中山市正群化工贸易有限公司");
        dto2.setLocation("T1101");
        dto2.setValidate("2019-06-13 23:59:00.0");
        dto2.setLoadingSeals("是");
        dto2.setOnSiteFee("封条费/装车过磅费");
        dto2.setCreator("吴高亮");
        dto2.setCreateDate("2019-06-12 12:27:25");
        dto2.setCheckor("王晓明");
        dto2.setCheckDate("2019-06-20 19:14:31");
        dto2.setBillMemo("222222");
        list.add(dto2);

        TransactionDTO dto3 = new TransactionDTO();
        dto3.setId("汇总");
        dto3.setPlanQuantity("100");
        list.add(dto3);

        TransactionDTO dto4 = new TransactionDTO();
        dto4.setSiteName("当前查出2条");
        list.add(dto4);

        return list;
    }
}
