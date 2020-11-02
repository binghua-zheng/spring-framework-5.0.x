package com.binghuazheng.ioc.init;

import com.binghuazheng.ioc.init.bean.UserService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/25 15:36
 * @Version 1.0
 */
public class Test {

	public static void main(String[] args) {
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		ClassPathBeanDefinitionScanner beanDefinitionScanner = new ClassPathBeanDefinitionScanner(beanFactory);
		beanDefinitionScanner.scan("com.binghuazheng.ioc.init");
		UserService userService = beanFactory.getBean(UserService.class);
		userService.getUserInfo();
	}
}
