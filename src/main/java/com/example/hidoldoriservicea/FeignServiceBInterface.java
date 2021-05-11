package com.example.hidoldoriservicea;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "kkk", url ="http://127.0.0.1:8082")
public interface FeignServiceBInterface {

    @RequestMapping("hidoldori/lab/hidoldori-service-b/")
    public String callServiceB();
}
