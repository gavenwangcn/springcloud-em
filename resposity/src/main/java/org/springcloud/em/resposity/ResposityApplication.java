package org.springcloud.em.resposity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ResposityApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResposityApplication.class, args);
    }
}
