package com.liutaiyue.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author 刘太月
 * @Despriction
 * @Created in 2019/6/19 14:38
 * @version: 1.0
 * <p>copyright: Copyright (c) 2018</p>
 */
@Configuration
public class Myconfig {
    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
