package com.hsx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.battcn.swagger.annotation.EnableSwagger2Doc;

@SpringBootApplication
@EnableSwagger2Doc
public class Demo11SpringbootSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demo11SpringbootSwaggerApplication.class, args);
	}
}
