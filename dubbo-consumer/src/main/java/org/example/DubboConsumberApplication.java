package org.example;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: kabudac
 * @Date: 2022/7/10 17:05
 * @Description:
 */
@SpringBootApplication
public class DubboConsumberApplication {
    public static void main(String[] args){
        SpringApplication.run(DubboConsumberApplication.class, args);
    }
}
