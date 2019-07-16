package com.mall.demo.controller;


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


    @RequestMapping("/{page}")
    public String showPage(@PathVariable("page") String page) {
        return "/admin/"+page;
    }
    @RequestMapping("/")
    public String showindex() {
        return "login";
    }




}
