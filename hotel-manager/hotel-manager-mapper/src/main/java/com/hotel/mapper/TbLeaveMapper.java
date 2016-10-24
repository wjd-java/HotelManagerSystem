package com.hotel.mapper;

import com.hotel.pojo.TbLeave;
import com.hotel.pojo.TbLeaveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbLeaveMapper {
    int countByExample(TbLeaveExample example);

    int deleteByExample(TbLeaveExample example);

    int deleteByPrimaryKey(String leaveId);

    int insert(TbLeave record);

    int insertSelective(TbLeave record);

    List<TbLeave> selectByExample(TbLeaveExample example);

    TbLeave selectByPrimaryKey(String leaveId);

    int updateByExampleSelective(@Param("record") TbLeave record, @Param("example") TbLeaveExample example);

    int updateByExample(@Param("record") TbLeave record, @Param("example") TbLeaveExample example);

    int updateByPrimaryKeySelective(TbLeave record);

    int updateByPrimaryKey(TbLeave record);
}