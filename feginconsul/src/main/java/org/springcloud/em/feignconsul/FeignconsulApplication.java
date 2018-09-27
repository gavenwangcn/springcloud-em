package org.springcloud.em.feignconsul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignconsulApplication {

    public static void main(String[] args) {

        SpringApplication.run(FeignconsulApplication.class, args);
    }
}
