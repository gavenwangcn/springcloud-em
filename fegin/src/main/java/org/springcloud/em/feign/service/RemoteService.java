package org.springcloud.em.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hello",fallback = RemoteService.Hystric.class)
public interface RemoteService {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String callClientOne(@RequestParam(value = "name") String name);


    class Hystric implements RemoteService{


        @Override
        public String callClientOne(String name) {
            return null;
        }
    }

}
