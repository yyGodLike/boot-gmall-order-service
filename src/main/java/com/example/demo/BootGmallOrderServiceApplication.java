package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.atguigu.user.IUserService;

@EnableDubbo
@SpringBootApplication
public class BootGmallOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootGmallOrderServiceApplication.class, args);
	}
}
