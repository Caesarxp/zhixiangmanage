package com.zhixiang.zhixiangmanage.mapper;

import com.zhixiang.zhixiangmanage.po.WebsiteAccountPrice;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WebsiteAccountPriceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WebsiteAccountPrice record);

    int insertSelective(WebsiteAccountPrice record);

    WebsiteAccountPrice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WebsiteAccountPrice record);

    int updateByPrimaryKey(WebsiteAccountPrice record);
}