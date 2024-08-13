package com.example.orderService.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.orderService.model.Menu;

@FeignClient(name = "menuservice",url = "http://localhost:8080")
public interface MenuClient {

		@GetMapping("/food-by-id/{id}")
		public Menu getFoodById(@PathVariable("id") int id);

}
