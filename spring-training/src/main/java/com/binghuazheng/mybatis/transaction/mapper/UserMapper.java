package com.binghuazheng.mybatis.transaction.mapper;

import com.binghuazheng.mybatis.transaction.pojo.UserInfo;

public interface UserMapper {

	UserInfo selectUserInfo(Long id);

	int insertUser(UserInfo userInfo);
}
