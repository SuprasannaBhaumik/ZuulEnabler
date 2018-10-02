package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@Configuration
public class ZuulEnablerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulEnablerApplication.class, args);
	}
	
	@Bean
	public CustomFilter customFilter() {
		return new CustomFilter();
	}
}
