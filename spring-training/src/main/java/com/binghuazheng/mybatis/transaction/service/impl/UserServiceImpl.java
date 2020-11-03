package com.binghuazheng.mybatis.transaction.service.impl;

import com.binghuazheng.mybatis.transaction.mapper.UserMapper;
import com.binghuazheng.mybatis.transaction.pojo.UserInfo;
import com.binghuazheng.mybatis.transaction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author Administrator
 * @Date 2020/11/3 22:29
 * @Version 1.0
 */
@Component
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	/**
	 *	查询用户信息
	 *
	 * @param id userId
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void selectUserInfo(Long id) {
		userMapper.selectUserInfo(id);
		userMapper.selectUserInfo(id);
		userMapper.selectUserInfo(id);
	}

	/**
	 * 添加用户信息
	 *
	 * @param userInfo 用户信息
	 * @return 用户ID
	 */
	@Override
	public Long insertUserInfo(UserInfo userInfo) {
		userMapper.insertUser(userInfo);
		return userInfo.getId();
	}
}
