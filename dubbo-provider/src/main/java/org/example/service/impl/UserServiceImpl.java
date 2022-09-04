package org.example.service.impl;

import com.example.service.UserService;
import org.apache.dubbo.common.stream.StreamObserver;
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

    @Override
    public void sayHelloStream(String name, StreamObserver<String> response) {
        response.onNext("hello:"+name);
        response.onNext("again:"+name);
        response.onCompleted();
    }

    @Override
    public StreamObserver<String> sayHelloStream(StreamObserver<String> response) {
        return new StreamObserver<String>() {
            @Override
            public void onNext(String data) {
                System.out.println("服务端接收到的数据："+data);
                response.onNext("响应结果"+data);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                System.out.println("发送完成");
                response.onCompleted();
            }
        };
    }
}
