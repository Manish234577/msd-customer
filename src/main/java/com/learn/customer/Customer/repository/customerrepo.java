package com.learn.customer.Customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.customer.Customer.model.customer;

public interface customerrepo extends JpaRepository<customer, Integer> {

}
