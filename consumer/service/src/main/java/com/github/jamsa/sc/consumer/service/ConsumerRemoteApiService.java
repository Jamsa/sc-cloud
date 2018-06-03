package com.github.jamsa.sc.consumer.service;

import com.github.jamsa.sc.consumer.service.impl.FeignFallbackConsumerRemoteService;
import com.github.jamsa.sc.provider.api.client.ProviderRemoteService;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name="sc-provider",fallback = FeignFallbackConsumerRemoteService.class)
public interface ConsumerRemoteApiService extends ProviderRemoteService {

}
