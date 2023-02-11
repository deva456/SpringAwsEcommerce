package com.meesho.springbootEcom.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meesho.springbootEcom.model.Customer;



@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long>{

	

}
