package com.github.jamsa.sc.provider.controller;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    //名为hello的队列
    @Bean
    public Queue helloQueue(){
        return new Queue("hello");
    }
}
