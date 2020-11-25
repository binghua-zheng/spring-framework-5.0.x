package com.binghuazheng.ioc.conditional;

import com.binghuazheng.ioc.conditional.bean.UserService;
import com.binghuazheng.ioc.conditional.config.AppConfig;
import com.binghuazheng.ioc.conditional.config.BusinessConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Administrator
 * @Date 2020/11/24 21:32
 * @Version 1.0
 */
public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(AppConfig.class);
		applicationContext.refresh();

		BusinessConfig userService = applicationContext.getBean(BusinessConfig.class);
		System.out.println(userService);
	}
}
