package com.learn.customer.Customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.learn.customer.Customer.model.customer;
import com.learn.customer.Customer.service.customerservice;
@RestController
public class customercontroller {
	@Autowired
	customerservice customerservice;
	
	@GetMapping("/homecustomer")
	public String home() {
		return "home page";
		
		
	}
	@GetMapping("/addcustomer")
	public String addcustomer(int id, String name, String gmail,int mobile) {
		customerservice.addcustomer(customer.builder().id(id).name(name).mobile(mobile).gmail(gmail).build());
		return "customer is added";
	}
	@GetMapping("/deletecustomer")
	public String deletecustomer(int id) {
		 customerservice.deletecustomer(id);
		 return "customer deleted";
	}
	@GetMapping("/getcustomers")
	public String getcustomers() {
		Gson gson=new Gson();
		String json=gson.toJson(customerservice.getcustomers());
		return json;
		
	}
}
