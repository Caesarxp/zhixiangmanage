package com.zhixiang.zhixiangmanage.mapper;

import com.zhixiang.zhixiangmanage.po.UserOwenerWebsiteAccount;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserOwenerWebsiteAccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserOwenerWebsiteAccount record);

    int insertSelective(UserOwenerWebsiteAccount record);

    UserOwenerWebsiteAccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserOwenerWebsiteAccount record);

    int updateByPrimaryKey(UserOwenerWebsiteAccount record);
}