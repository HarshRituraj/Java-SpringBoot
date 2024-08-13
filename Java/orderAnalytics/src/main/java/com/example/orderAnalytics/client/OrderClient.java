package com.example.orderAnalytics.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.orderAnalytics.model.Orders;

@FeignClient(name = "orderservice",url = "http://localhost:8081")
public interface OrderClient {

	@GetMapping("/all-orders")
	public List<Orders> allOrders();

}
