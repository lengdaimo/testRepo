package com.demo.auto.dao;

import com.demo.auto.model.TbUnique2;
import com.demo.auto.model.TbUnique2Example;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TbUnique2Mapper {
    long countByExample(TbUnique2Example example);

    int deleteByExample(TbUnique2Example example);

    int insert(TbUnique2 record);

    int insertSelective(TbUnique2 record);

    List<TbUnique2> selectByExample(TbUnique2Example example);

    int updateByExampleSelective(@Param("record") TbUnique2 record, @Param("example") TbUnique2Example example);

    int updateByExample(@Param("record") TbUnique2 record, @Param("example") TbUnique2Example example);
}