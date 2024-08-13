package com.example.orderAnalytics.controller;

import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.orderAnalytics.model.Analytics;
import com.example.orderAnalytics.service.OrderAnalyticsService;

@RestController
public class OrderAnalyticsController {
	
	@Autowired
	OrderAnalyticsService orderAnalyticsService;
	
	@GetMapping("/orders-analytics")
	public Set<Analytics> orderAnalytics()
	{
		return orderAnalyticsService.orderAnalytics();
	}
	
}
