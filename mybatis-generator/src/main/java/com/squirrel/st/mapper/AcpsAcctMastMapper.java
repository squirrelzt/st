package com.squirrel.st.mapper;

import com.squirrel.st.domain.AcpsAcctMast;
import com.squirrel.st.domain.AcpsAcctMastExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcpsAcctMastMapper {
    long countByExample(AcpsAcctMastExample example);

    int deleteByExample(AcpsAcctMastExample example);

    int insert(AcpsAcctMast record);

    int insertSelective(AcpsAcctMast record);

    List<AcpsAcctMast> selectByExample(AcpsAcctMastExample example);

    int updateByExampleSelective(@Param("record") AcpsAcctMast record, @Param("example") AcpsAcctMastExample example);

    int updateByExample(@Param("record") AcpsAcctMast record, @Param("example") AcpsAcctMastExample example);
}