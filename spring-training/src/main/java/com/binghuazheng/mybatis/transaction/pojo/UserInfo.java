package com.binghuazheng.mybatis.transaction.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @ClassName UserInfo
 * @Description TODO
 * @Author Administrator
 * @Date 2020/11/2 21:36
 * @Version 1.0
 */
@Setter
@Getter
@ToString
public class UserInfo {

	private Long id;

	private String name;

	private String birthday;

	private boolean deleteFlag;
}
