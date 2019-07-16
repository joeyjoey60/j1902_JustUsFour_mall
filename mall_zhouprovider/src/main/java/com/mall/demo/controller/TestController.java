package com.mall.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhou on 2019/7/16.
 */
@RestController
public class TestController {

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public String test1(){
        return  "my test";
    }
}
