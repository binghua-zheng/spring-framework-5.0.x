package com.binghuazheng.ioc.factorybean.bean.impl;

import com.binghuazheng.ioc.factorybean.bean.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author Administrator
 * @Date 2020/11/15 18:57
 * @Version 1.0
 */
public class UserServiceImpl implements UserService {

	private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

	@Override
	public void selectUserInfo(Long id) {
		log.info("UserServiceImpl#selectUserInfo");
	}
}
