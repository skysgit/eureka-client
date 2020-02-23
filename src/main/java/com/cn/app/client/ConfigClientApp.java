package com.cn.app.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @EnableEurekaClient或者使用@EnableDiscoveryClient
 */
@EnableEurekaClient
@SpringBootApplication
public class ConfigClientApp {
	  public static void main(String[] args) {
	        SpringApplication.run(ConfigClientApp.class, args);
	    }
}
