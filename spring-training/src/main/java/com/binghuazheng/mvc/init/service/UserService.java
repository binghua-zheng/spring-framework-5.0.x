package com.binghuazheng.mvc.init.service;

import com.binghuazheng.mvc.init.bo.UserInfo;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author Administrator
 * @Date 2020/9/27 23:53
 * @Version 1.0
 */
@Service
public class UserService {

    public UserInfo userInfo(String userId) {
        System.err.println("select user info -> " + userId);
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(Long.parseLong(userId));
        userInfo.setUserName("zhangsan");
        return userInfo;
    }
}
