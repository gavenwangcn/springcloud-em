package org.springcloud.em.feignconsul.controller;
import org.springcloud.em.feignconsul.service.RemoteService;
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
