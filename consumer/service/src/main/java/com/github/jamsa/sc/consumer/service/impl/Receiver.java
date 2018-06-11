package com.github.jamsa.sc.consumer.service.impl;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello")
public class Receiver {


    @RabbitHandler
    public void process(String hello){
        System.out.println("接收到消息:"+hello);
    }
}
