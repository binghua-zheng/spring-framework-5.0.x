package com.binghuazheng.ioc.conditional.config;

import com.binghuazheng.ioc.conditional.bean.UserService;
import com.binghuazheng.ioc.conditional.bean.impl.UserServiceImpl;
import com.binghuazheng.ioc.conditional.condition.ConditionOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName BusinessConfig
 * @Description TODO
 * @Author Administrator
 * @Date 2020/11/24 21:28
 * @Version 1.0
 */
@Conditional(ConditionOnBean.class)
@Configuration
public class BusinessConfig {

	@Bean
	public UserService userService() {
		return new UserServiceImpl();
	}

}
