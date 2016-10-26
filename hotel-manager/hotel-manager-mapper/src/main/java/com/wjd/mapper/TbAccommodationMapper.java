package com.wjd.mapper;

import com.wjd.pojo.TbAccommodation;
import com.wjd.pojo.TbAccommodationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAccommodationMapper {
    int countByExample(TbAccommodationExample example);

    int deleteByExample(TbAccommodationExample example);

    int deleteByPrimaryKey(String accommodationId);

    int insert(TbAccommodation record);

    int insertSelective(TbAccommodation record);

    List<TbAccommodation> selectByExample(TbAccommodationExample example);

    TbAccommodation selectByPrimaryKey(String accommodationId);

    int updateByExampleSelective(@Param("record") TbAccommodation record, @Param("example") TbAccommodationExample example);

    int updateByExample(@Param("record") TbAccommodation record, @Param("example") TbAccommodationExample example);

    int updateByPrimaryKeySelective(TbAccommodation record);

    int updateByPrimaryKey(TbAccommodation record);
}