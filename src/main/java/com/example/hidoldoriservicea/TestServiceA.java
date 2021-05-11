package com.example.hidoldoriservicea;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TestServiceA {


    public TestServiceA(){
    }

    public void test(){
        log.debug("#test TestServiceA is started#");
        log.debug("#test TestServiceA is Ended#");
    }
}
