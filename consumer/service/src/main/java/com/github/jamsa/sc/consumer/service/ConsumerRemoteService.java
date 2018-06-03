package com.github.jamsa.sc.consumer.service;

import com.github.jamsa.sc.consumer.service.impl.FeignFallbackConsumerRemoteService;
import com.github.jamsa.sc.provider.api.client.ProviderRemoteService;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 引用服务提供方提供的接口
 */
@FeignClient(name="sc-provider",fallback = FeignFallbackConsumerRemoteService.class)
public interface ConsumerRemoteService{
    @RequestMapping(value="/provider/hello",method= RequestMethod.GET)
    String hello(@RequestParam("name") String name);
}
