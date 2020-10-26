package com.binghuazheng.ioc.init.bean;

import org.springframework.stereotype.Component;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/25 15:33
 * @Version 1.0
 */
@Component
public class UserService {

	public void getUserInfo() {
		System.out.println("UserService#getUserInfo");
	}
}
