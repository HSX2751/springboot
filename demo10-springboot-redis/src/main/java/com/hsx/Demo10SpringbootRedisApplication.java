package com.hsx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

//@EnableCaching必须要加，否则spring-data-cache相关注解不会生效…

@SpringBootApplication
@EnableCaching
public class Demo10SpringbootRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demo10SpringbootRedisApplication.class, args);
	}
}
