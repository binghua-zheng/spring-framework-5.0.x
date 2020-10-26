package com.binghuazheng.ioc.init;

import com.binghuazheng.ioc.init.bean.UserService;
import com.binghuazheng.ioc.init.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/25 15:36
 * @Version 1.0
 */
public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(AppConfig.class);
		applicationContext.refresh();
		UserService userService = applicationContext.getBean(UserService.class);
		userService.getUserInfo();
	}
}
