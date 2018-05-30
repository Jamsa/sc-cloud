package com.github.jamsa.sc.demo0.api.client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zhujie on 2018/5/29.
 */
public interface Demo0RemoteService {
    @RequestMapping(value="/hello",method= RequestMethod.GET)
    String hello(@RequestParam String name);
}
