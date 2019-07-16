package com.mall.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zhou on 2019/7/16.
 */
@FeignClient(value = "zhouprovider")
public interface TestService {

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public String test1();
}
