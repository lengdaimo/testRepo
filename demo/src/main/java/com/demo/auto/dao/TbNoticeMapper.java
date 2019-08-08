package com.demo.auto.dao;

import com.demo.auto.model.TbNotice;
import com.demo.auto.model.TbNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbNoticeMapper {
    long countByExample(TbNoticeExample example);

    int deleteByExample(TbNoticeExample example);

    int deleteByPrimaryKey(Long ntId);

    int insert(TbNotice record);

    int insertSelective(TbNotice record);

    List<TbNotice> selectByExample(TbNoticeExample example);

    TbNotice selectByPrimaryKey(Long ntId);

    int updateByExampleSelective(@Param("record") TbNotice record, @Param("example") TbNoticeExample example);

    int updateByExample(@Param("record") TbNotice record, @Param("example") TbNoticeExample example);

    int updateByPrimaryKeySelective(TbNotice record);

    int updateByPrimaryKey(TbNotice record);
}