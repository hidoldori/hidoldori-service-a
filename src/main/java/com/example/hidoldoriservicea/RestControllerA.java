package com.example.hidoldoriservicea;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("hidoldori/lab/hidoldori-service-a")
public class RestControllerA {

    private TestServiceA testServiceA;

    private FeignServiceBInterface feignServiceBInterface;

    public RestControllerA(TestServiceA testServiceA, FeignServiceBInterface feignServiceBInterface){
        this.testServiceA = testServiceA;
        this.feignServiceBInterface = feignServiceBInterface;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String test( ){
        log.debug("#1-RestControllerA.test is started#");
        testServiceA.test();
        log.debug("#2-testServiceA.test() is Ended#");
        feignServiceBInterface.callServiceB();
        log.debug("#3-feignServiceBInterface.callServiceB() is Ended#");

        return "#WEB A Call Success";
    }



}
