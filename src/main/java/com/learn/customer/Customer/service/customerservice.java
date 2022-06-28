package com.learn.customer.Customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.customer.Customer.model.customer;
import com.learn.customer.Customer.repository.customerrepo;

import lombok.Builder;

@Service
public class customerservice {
	@Autowired
	customerrepo repository;
	public void addcustomer(customer Customer) {
		repository.save(Customer);
		
	}
	public List<customer> getcustomers(){
		return repository.findAll();
		
	}
	public void deletecustomer(int id) {
		repository.delete(customer.builder().id(id).build());
	
	}
	
}
