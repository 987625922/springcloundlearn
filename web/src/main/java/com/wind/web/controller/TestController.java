package com.wind.web.controller;

import com.wind.common.api.TestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/test")
public class TestController {

    @Autowired
    TestApi testApi;

    @RequestMapping("/test_string")
    public Object getTest() {
        return testApi.getTestString();
    }
}
