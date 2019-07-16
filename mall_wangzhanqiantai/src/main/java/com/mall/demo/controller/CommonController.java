package com.mall.demo.controller;

import com.mall.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhou on 2019/7/16.
 */
@Controller
public class CommonController {
    @Autowired
    private TestService testService;

    @RequestMapping("/{page}")
    public String showPage(@PathVariable("page") String page) {
        return page;
    }
    @RequestMapping("/")
    public String showindex() {
        return "index";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        String s = testService.test1();
        return s+"ttt";
    }


}
