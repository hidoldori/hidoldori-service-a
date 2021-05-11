package com.example.hidoldoriservicea;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "hidoldori-service-b", url ="")
public interface FeignServiceBInterface {

    @RequestMapping("hidoldori/lab/hidoldori-service-b/")
    public String callServiceB();
}
