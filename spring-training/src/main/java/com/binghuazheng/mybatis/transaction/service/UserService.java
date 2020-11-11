package com.binghuazheng.mybatis.transaction.service;

import com.binghuazheng.mybatis.transaction.pojo.UserInfo;

public interface UserService {

	void selectUserInfo(Long id);

	Long insertUserInfo(UserInfo userInfo);

	Long insertUser(UserInfo userInfo);
}
