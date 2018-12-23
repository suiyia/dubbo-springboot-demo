package com.cn.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cn.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: ChenLi  2018/12/22 13:05
 * @Description:
 */
@Controller
public class HelloController {

    @Reference
    private HelloService helloService;

    @RequestMapping("/say")
    public void sayHello(String name){
        helloService.sayHello(name);
    }

    @RequestMapping("/get")
    @ResponseBody
    public String getName(){
        Date date = helloService.getTime();
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
    }

}
