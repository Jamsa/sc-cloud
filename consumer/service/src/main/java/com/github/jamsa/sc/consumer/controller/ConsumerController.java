package com.github.jamsa.sc.consumer.controller;

import com.github.jamsa.sc.consumer.service.ConsumerRemoteApiService;
import com.github.jamsa.sc.consumer.service.ConsumerRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务消费方
 * Created by zhujie on 2018/5/29.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.github.jamsa.sc.consumer.service"})
@RestController
@RequestMapping("/consumer")
@ComponentScan(basePackages={"com.github.jamsa.sc.consumer"})
public class ConsumerController{

    //注入服务接口
    @Autowired
    private ConsumerRemoteService consumerRemoteService;

    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        return "Hello From Remote:"+consumerRemoteService.hello(name);
    }

    @Autowired
    private ConsumerRemoteApiService consumerRemoteApiService;

    @RequestMapping("/helloByApi")
    public String helloByApi(@RequestParam String name) {
        return "Hello From Remote By API:"+consumerRemoteApiService.hello(name);
    }


    public static void main(String[] args) {
        SpringApplication.run(ConsumerController.class,args);
    }
}
