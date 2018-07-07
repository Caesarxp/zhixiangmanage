package com.zhixiang.zhixiangmanage.mapper;

import com.zhixiang.zhixiangmanage.po.PaymentRecord;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PaymentRecord record);

    int insertSelective(PaymentRecord record);

    PaymentRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PaymentRecord record);

    int updateByPrimaryKey(PaymentRecord record);
}