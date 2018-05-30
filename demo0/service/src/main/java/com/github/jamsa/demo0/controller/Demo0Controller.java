package com.github.jamsa.demo0.controller;

import com.github.jamsa.sc.demo0.api.client.Demo0RemoteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by zhujie on 2018/5/29.
 */

@SpringBootApplication
@EnableEurekaClient
public class Demo0Controller implements Demo0RemoteService {

    @Override
    public String hello(String name) {
        return "Hello "+name;
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo0Controller.class,args);
    }
}
