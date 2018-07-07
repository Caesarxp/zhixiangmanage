package com.zhixiang.zhixiangmanage.mapper;

import com.zhixiang.zhixiangmanage.po.SequenceId;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SequenceIdMapper {
    int deleteByPrimaryKey(Long idTimes);

    int insert(SequenceId record);

    int insertSelective(SequenceId record);

    SequenceId selectByPrimaryKey(Long idTimes);

    int updateByPrimaryKeySelective(SequenceId record);

    int updateByPrimaryKey(SequenceId record);
}