package org.example.controller;

import com.example.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Method;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: kabudac
 * @Date: 2022/7/10 16:17
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @DubboReference()
    private UserService userService;

    @RequestMapping("/say")
    public String sayHello() {
        return userService.sayHello();
    }
}
