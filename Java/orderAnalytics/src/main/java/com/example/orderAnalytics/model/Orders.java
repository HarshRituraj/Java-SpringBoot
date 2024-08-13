package com.example.orderAnalytics.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders{
	
	private int orderId;
	private int foodId;
	private int quantity;
	private int amount;
	private String foodName;
}
