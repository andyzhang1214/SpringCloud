package com.hwua.boot;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Configuration
public class IndexController {

    @GetMapping("getinvoker")
    public String invoker() {
        return getRestTamplate().getForObject("http://provider/getprovider", String.class) + "invoker";

    }

    @Bean//将该对象注册到springIoc中
    @LoadBalanced
    public RestTemplate getRestTamplate() {
        return new RestTemplate();
    }

}
