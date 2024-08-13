package com.example.menuService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.menuService.entity.Menu;
import com.example.menuService.service.MenuService;

@CrossOrigin
@RestController
public class MenuController {

	@Autowired
	MenuService menuService;
	
	@GetMapping("/food-by-id/{id}")
	public Menu getFoodById(@PathVariable("id") int id)
	{
		return menuService.getFoodById(id);
	}
	
	@GetMapping("/all-food")
	public List<Menu> allFood()
	{
		return menuService.allFood();
	}
}
