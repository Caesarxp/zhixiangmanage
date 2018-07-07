package com.zhixiang.zhixiangmanage.mapper;

import com.zhixiang.zhixiangmanage.po.SplitRecord;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SplitRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SplitRecord record);

    int insertSelective(SplitRecord record);

    SplitRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SplitRecord record);

    int updateByPrimaryKey(SplitRecord record);
}