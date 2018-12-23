package com.cn.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.cn.HelloService;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author: ChenLi  2018/12/22 12:54
 * @Description:
 */
@Service
@Component
public class HelloServiceImpl implements HelloService {
    public void sayHello(String name) {
        System.out.println("Hello "+ name);
    }

    public Date getTime() {
        return new Date();
    }
}
