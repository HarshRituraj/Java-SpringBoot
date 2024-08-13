package com.example.orderAnalytics.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.orderAnalytics.client.OrderClient;
import com.example.orderAnalytics.model.Analytics;
import com.example.orderAnalytics.model.Orders;
import jakarta.transaction.Transactional;

@Service
public class OrderAnalyticsService {
	
	@Autowired
	OrderClient orderClient;
	
	@Transactional
	public Set<Analytics> orderAnalytics()
	{
		List<Orders> orders = orderClient.allOrders(); 
//		System.out.println(orders);
		int foodId;
		String foodName;
		Set<Analytics> an = new HashSet<>();
		for(Orders ord : orders)
		{
			int quantity=0;
			int totalAmount=0;
			Analytics a = new Analytics();
			foodId = ord.getFoodId();
			a.setFoodId(foodId);
			foodName = ord.getFoodName();
			a.setFoodName(foodName);
			
			for(Orders or : orders)
			{
				if(ord.getFoodId() == or.getFoodId())
				{
					totalAmount += or.getAmount();				
					quantity += or.getQuantity();
				}
			}
			
			a.setQuantity(quantity);
			a.setTotalAmount(totalAmount);
			an.add(a);
		}
		return an;
	}
}
