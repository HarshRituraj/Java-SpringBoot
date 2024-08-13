package com.example.menuService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.menuService.entity.Menu;
import com.example.menuService.repository.MenuRepository;

import jakarta.transaction.Transactional;

@Service
public class MenuService {
	
	@Autowired
	MenuRepository menuRepository;

	@Transactional
	public List<Menu> getMenu()
	{
		return menuRepository.findAll();
	}
	
	@Transactional
	public Menu getFoodById(int id)
	{
		return menuRepository.findById(id).orElse(null);
	}
}
