package com.xiaoe.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/")
public class HeartbeatController {

    private static SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    @GetMapping("/heartbeat")
    @ResponseBody
    public String index(){
        return "heartbeat: " + simpleDateFormat.format(new Date());
    }
}
