package com.domain.read;

import lombok.Data;

import java.util.List;

@Data
public class ReadItem {

    private List<FirstSheetItem> firstSheetList;

    private List<SecondSheetItem> secondSheetList;
}
