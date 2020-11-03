package com.binghuazheng.mybatis.transaction.test;

import com.binghuazheng.mybatis.transaction.config.AppConfig;
import com.binghuazheng.mybatis.transaction.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName TransactionTest
 * @Description TODO
 * @Author Administrator
 * @Date 2020/11/2 22:06
 * @Version 1.0
 */
public class TransactionTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(AppConfig.class);
		applicationContext.refresh();
		UserService userService = applicationContext.getBean(UserService.class);
		userService.selectUserInfo(1L);
	}

}
