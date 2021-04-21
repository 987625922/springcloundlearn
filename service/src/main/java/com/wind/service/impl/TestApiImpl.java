package com.wind.service.impl;

import com.wind.common.api.TestApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApiImpl implements TestApi {

    @Override
    public String getTestString() {
        return "测试数据";
    }
}
