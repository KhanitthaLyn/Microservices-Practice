package com.demo.consumer.restClient;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
@RequestMapping("/api/rest-client")
@RequiredArgsConstructor
public class RestClientController {

//    private final RestClient restClient = RestClient.create();

    private final ProviderRestClient providerRestClient;

    @GetMapping("/instance")
    public String getInstance() {
//        return restClient.get()
//                .uri("http://localhost:2222/instance-info")
//                .retrieve()
//                .body(String.class);
        return providerRestClient.getInstanceInfo();
    }
}