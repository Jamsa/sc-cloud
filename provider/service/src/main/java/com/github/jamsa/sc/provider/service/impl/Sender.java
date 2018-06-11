package com.github.jamsa.sc.provider.service.impl;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Sender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    /**
     * 发送消息至hello队列
     */
    public void send(){
        String message = "hello "+new Date();
        System.out.println("发送消息:"+message);
        amqpTemplate.convertAndSend("hello",message);

    }
}
