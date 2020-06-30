package com.fsd.emart.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class OrderService {

	public static void main(String[] args) {
		SpringApplication.run(OrderService.class);

	}

}
