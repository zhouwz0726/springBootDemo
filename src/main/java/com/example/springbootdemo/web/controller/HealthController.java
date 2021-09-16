package com.example.springbootdemo.web.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:zhouwz
 * @date 2021-09-16 10:45
 */
@Component
@RequestMapping("/health")
public class HealthController {

    /**
     * 健康检查
     */
    @RequestMapping(value = "/status", method = {RequestMethod.HEAD, RequestMethod.GET})
    @ResponseBody
    public String healthCheck() {


        return "server is start,OK!!!";
    }

}
