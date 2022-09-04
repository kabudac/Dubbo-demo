package com.example.service;

import org.apache.dubbo.common.stream.StreamObserver;

/**
 * @Author: kabudac
 * @Date: 2022/7/10 15:56
 * @Description:
 */
public interface UserService {
    String sayHello();


    // Server Stream
    default void sayHelloStream(String name, StreamObserver<String> response){
    }

    // Client Stream
    default StreamObserver<String> sayHelloStream(StreamObserver<String> response){
        return response;
    }
}
