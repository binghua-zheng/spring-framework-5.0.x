package com.binghuazheng.ioc.conditional.bean.impl;

import com.binghuazheng.ioc.conditional.bean.OrderService;
import com.binghuazheng.ioc.conditional.bean.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author Administrator
 * @Date 2020/11/24 21:18
 * @Version 1.0
 */
public class UserServiceImpl implements UserService {

	private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private OrderService orderService;

	@Override
	public void selectUserInfo() {
		orderService.getOrderInfo();
	}
}
