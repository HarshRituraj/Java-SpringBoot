package com.example.menuService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.menuService.entity.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Integer>{

	
}
