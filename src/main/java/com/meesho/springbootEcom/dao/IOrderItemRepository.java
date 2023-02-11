package com.meesho.springbootEcom.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meesho.springbootEcom.model.OrderItem;



@Repository
public interface IOrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}


