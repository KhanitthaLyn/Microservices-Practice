package com.demo.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name = "provider-service", url = "${provider.url}")
@FeignClient(name = "provider")
public interface ProviderFeignClient {
    @GetMapping("/instance-info")
    String getInstanceInfo();
}
