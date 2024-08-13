package com.example.orderAnalytics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class OrderAnalyticsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderAnalyticsApplication.class, args);
	}

}
