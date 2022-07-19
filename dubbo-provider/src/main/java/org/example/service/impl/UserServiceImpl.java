package org.example.service.impl;

import com.example.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @Author: kabudac
 * @Date: 2022/7/10 15:56
 * @Description:
 */
@DubboService
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello() {
        return "hello dubbo";
    }
}
