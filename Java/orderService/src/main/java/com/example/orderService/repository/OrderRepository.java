package com.example.orderService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.orderService.entity.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders,Integer>{

}
