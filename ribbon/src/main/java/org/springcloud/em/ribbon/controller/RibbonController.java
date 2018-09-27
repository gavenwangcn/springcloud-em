package org.springcloud.em.ribbon.controller;

import org.springcloud.em.ribbon.service.RemoteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class RibbonController {

    @Resource
    RemoteService remoteService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return remoteService.hiService( name );
    }
}
