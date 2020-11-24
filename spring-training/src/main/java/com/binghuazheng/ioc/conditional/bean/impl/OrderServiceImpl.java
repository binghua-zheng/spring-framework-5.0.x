package com.binghuazheng.ioc.conditional.bean.impl;

import com.binghuazheng.ioc.conditional.bean.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @ClassName OrderServiceImpl
 * @Description TODO
 * @Author Administrator
 * @Date 2020/11/24 21:18
 * @Version 1.0
 */
@Component
public class OrderServiceImpl implements OrderService {

	private static final Logger log = LoggerFactory.getLogger(OrderServiceImpl.class);

	@Override
	public void getOrderInfo() {
		log.info("获取订单信息.");
	}
}
