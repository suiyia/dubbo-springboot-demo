package com.cn.provider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin//允许跨越访问
@SpringBootApplication
@EnableDubboConfiguration
public class ProviderApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }

    public void run(String... args) throws Exception {
        Thread.currentThread().join();
    }
}

