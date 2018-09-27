package org.springcloud.em.consul.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {



    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home() {
        return "hi ,i'm springcloud consul";
    }


    @RequestMapping("/hello")
    @HystrixCommand(fallbackMethod = "helloError")
    public String hello(@RequestParam(value = "name", defaultValue = "service-hello") String name) {
        return "hello " + name + " ,i am from port:" + port;
    }

    public String helloError(String name) {
        return "hi,"+name+",sorry,error!";
    }

}
