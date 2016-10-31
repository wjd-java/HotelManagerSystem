package com.wjd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wjd.common.pojo.PagingQuery;
import com.wjd.pojo.TbUser;
import com.wjd.pojo.TbUserExample;

public interface TbUserMapper {
    int countByExample(TbUserExample example);

    int deleteByExample(TbUserExample example);

    int deleteByPrimaryKey(String idCard);

    int insert(TbUser record);

    int insertSelective(TbUser record);

    List<TbUser> selectByExample(TbUserExample example);
    
    List<TbUser> selectByPagingQuery(PagingQuery pagingQuery);
    
    TbUser selectByPrimaryKey(String idCard);

    int updateByExampleSelective(@Param("record") TbUser record, @Param("example") TbUserExample example);

    int updateByExample(@Param("record") TbUser record, @Param("example") TbUserExample example);

    int updateByPrimaryKeySelective(TbUser record);

    int updateByPrimaryKey(TbUser record);
}