package com.example.orderAnalytics.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Analytics {
	
	private int foodId;
	private String foodName;
	private int totalAmount;
	private int quantity;
}
