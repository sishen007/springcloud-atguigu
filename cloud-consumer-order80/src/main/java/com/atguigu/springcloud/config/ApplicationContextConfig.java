package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * TODO
 *
 * @author wangyh2
 * @version v1.0
 * @since 2020-12-04 09:34
 */
@Configuration
public class ApplicationContextConfig {

    // LoadBalanced 负载均衡调取eureka 不然会报错
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
