package com.binghuazheng.mvc.init.controller;

import com.binghuazheng.mvc.init.bo.UserInfo;
import com.binghuazheng.mvc.init.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author Administrator
 * @Date 2020/9/27 23:53
 * @Version 1.0
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/userInfo/{id}")
    public UserInfo userInfo(@PathVariable("id") String userId) {
        return userService.userInfo(userId);
    }

}
