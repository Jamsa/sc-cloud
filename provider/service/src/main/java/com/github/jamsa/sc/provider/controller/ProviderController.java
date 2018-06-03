package com.github.jamsa.sc.provider.controller;

import com.github.jamsa.sc.provider.api.client.ProviderRemoteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  服务提供方
 * Created by zhujie on 2018/5/29.
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
@ComponentScan(basePackages={"com.github.jamsa.sc.provider"})
//@RequestMapping("/provider")
public class ProviderController implements ProviderRemoteService {

    @Override
    public String hello(String name) {
        return "Hello "+name;
    }

    public static void main(String[] args) {
        SpringApplication.run(ProviderController.class,args);
    }
}
