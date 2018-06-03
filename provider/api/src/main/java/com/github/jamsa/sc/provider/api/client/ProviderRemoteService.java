package com.github.jamsa.sc.provider.api.client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 服务提供方接口
 * Created by zhujie on 2018/5/29.
 */
public interface ProviderRemoteService {
    @RequestMapping(value="/hello",method= RequestMethod.GET)
    String hello(@RequestParam("name") String name);//这个name对服务消费方是必须的，否则调用时会报错
}
