package com.demo.consumer.http;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.client.support.RestTemplateAdapter;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;
import org.springframework.web.util.DefaultUriBuilderFactory;

@Configuration
public class HttpInterfaceConfig {

//    @Bean
//    public ProviderHttpInterface webClientHttpInterface() {
//        WebClient webClient = WebClient
//                .builder()
//                .baseUrl("http://localhost:2222")
//                .build();
//        WebClientAdapter adapter = WebClientAdapter.create(webClient);
//        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
//
//        ProviderHttpInterface service = factory.createClient(ProviderHttpInterface.class);
//        return service;
//    }

    public RestTemplate restTemplate (){
        return new RestTemplate();
    }
//        @Bean
//    public ProviderHttpInterface restwebClientHttpInterface(RestTemplate restTemplate) {
//            restTemplate.setUriTemplateHandler(new DefaultUriBuilderFactory("http://provider"));
//            RestTemplateAdapter adapter = RestTemplateAdapter.create(restTemplate);
//            HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
//
//            ProviderHttpInterface service = factory.createClient(ProviderHttpInterface.class);
//
//        return service;

    @LoadBalanced
    public RestClient.Builder restClientBuilder(){
        return RestClient.builder();
    }

    @Bean
    public ProviderHttpInterface restwebClientHttpInterface(RestClient.Builder restClientBuilder) {
        RestClient restClient = restClientBuilder.baseUrl("http://provider").build();
            RestClientAdapter adapter = RestClientAdapter.create(restClient);
            HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();

            ProviderHttpInterface service = factory.createClient(ProviderHttpInterface.class);

        return service;
    }
}
