package com.zhixiang.zhixiangmanage.mapper;

import com.zhixiang.zhixiangmanage.po.OperatorLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OperatorLogMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(OperatorLog record);

    int insertSelective(OperatorLog record);

    OperatorLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OperatorLog record);

    int updateByPrimaryKey(OperatorLog record);
}