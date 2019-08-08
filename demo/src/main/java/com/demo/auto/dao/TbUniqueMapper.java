package com.demo.auto.dao;

import com.demo.auto.model.TbUnique;
import com.demo.auto.model.TbUniqueExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TbUniqueMapper {
    long countByExample(TbUniqueExample example);

    int deleteByExample(TbUniqueExample example);

    int insert(TbUnique record);

    int insertSelective(TbUnique record);

    List<TbUnique> selectByExample(TbUniqueExample example);

    int updateByExampleSelective(@Param("record") TbUnique record, @Param("example") TbUniqueExample example);

    int updateByExample(@Param("record") TbUnique record, @Param("example") TbUniqueExample example);
}