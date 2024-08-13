package com.example.menuService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.menuService.entity.Menu;
import com.example.menuService.service.MenuService;

@RestController
public class MenuController {
	
	@Autowired
	MenuService menuService;
	
	@GetMapping("/get-menu")
	public List<Menu> getMenu()
	{
		return menuService.getMenu();
	}
	
	@GetMapping("/get-food-by-id")
	public Menu getFoodById(@RequestParam("id") int id)
	{
		return menuService.getFoodById(id);
	}
}
