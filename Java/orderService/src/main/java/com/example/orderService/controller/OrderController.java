package com.example.orderService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.orderService.entity.Orders;
import com.example.orderService.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@GetMapping("/orders")
	public Orders order(@RequestBody Orders details)
	{
		return orderService.orders(details);
	}
	
	@GetMapping("/all-orders")
	public List<Orders> allOrders()
	{
		return orderService.allOrders();
	}
}
