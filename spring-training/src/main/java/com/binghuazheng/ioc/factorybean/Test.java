package com.binghuazheng.ioc.factorybean;

import com.binghuazheng.ioc.factorybean.bean.UserService;
import com.binghuazheng.ioc.factorybean.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 实现了FactoryBean接口的类，它本身是直接通过Spring正常的生命周期创建然后放入beanFactory的。
 * 内部getObject方法内返回的对象是懒加载的，并且此对象也不会被放入beanFactory的。所以无法通过该对象名称去获取。
 * 需要通过该对象类型去获取。或者通过实现了FactoryBean接口的类的beanName去获取该对象。
 * 如果通过 &beanName去获取，获取到的是实现了FactoryBean接口的类对象。
 *
 *
 * @ClassName Test
 * @Description TODO
 * @Author Administrator
 * @Date 2020/11/15 19:01
 * @Version 1.0
 */
public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(AppConfig.class);
		applicationContext.refresh();
		UserService userService = (UserService)applicationContext.getBean("userServiceFactoryBean");
		userService.selectUserInfo(1L);
	}
}
