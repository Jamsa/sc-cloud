package com.github.jamsa.sc.consumer.service.impl;

import com.github.jamsa.sc.consumer.service.ConsumerRemoteService;
import org.springframework.stereotype.Component;


@Component
public class FeignFallbackConsumerRemoteService implements ConsumerRemoteService {

    @Override
    public String hello(String name) {
        return "未连接远程服务";
    }
}
