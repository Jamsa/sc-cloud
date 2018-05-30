package com.github.jamsa.demo1.controller;

import com.github.jamsa.sc.demo1.api.client.Demo1RemoteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by zhujie on 2018/5/29.
 */
@SpringBootApplication
@EnableEurekaClient
public class Demo1Controller implements Demo1RemoteService {

    @Override
    public String hello(String name) {
        return "Hello "+name;
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo1Controller.class,args);
    }
}
