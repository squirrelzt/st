package com.util;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.metadata.Sheet;
import com.domain.TruckDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("E:" + File.separator + "two.xlsx");
        InputStream inputStream = new FileInputStream(file);
        List<Object> data = EasyExcelFactory.read(inputStream, new Sheet(1, 1, TruckDriver.class));
        System.out.println(data.size());
        System.out.println(data);
    }
}
