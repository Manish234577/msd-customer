package com.learn.customer.Customer.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class customer {
	@Id
	private int id;
	private String name;
	private int mobile;
	private String gmail;

}
