package com.example.orderService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.orderService.client.MenuClient;
import com.example.orderService.entity.Orders;
import com.example.orderService.model.Menu;
import com.example.orderService.repository.OrderRepository;

import jakarta.transaction.Transactional;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	MenuClient menuClient;
	
	@Transactional
	public Orders orders(Orders details)
	{
		Menu m = menuClient.getFoodById(details.getFoodId());
		details.setAmount(details.getQuantity() * m.getPrice());
		details.setFoodName(m.getFoodName());
		return orderRepository.save(details);
	}
	
	@Transactional
	public List<Orders> allOrders()
	{
		return orderRepository.findAll();
	}
}
