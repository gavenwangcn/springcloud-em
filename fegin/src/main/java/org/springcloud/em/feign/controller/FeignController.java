package org.springcloud.em.feign.controller;
import org.springcloud.em.feign.service.RemoteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class FeignController {

    @Resource
    RemoteService remoteService;

    @GetMapping(value = "/hello")
    public String sayHi(@RequestParam String name) {
        return remoteService.callClientOne( name );
    }
}
