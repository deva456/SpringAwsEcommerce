package com.meesho.springbootEcom.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meesho.springbootEcom.model.Orders;




	@Repository
	public interface IOrderRepository extends JpaRepository<Orders, Long> {
		
	}

