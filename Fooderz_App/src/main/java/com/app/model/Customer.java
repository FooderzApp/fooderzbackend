package com.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Customer {
	@Id
	@GeneratedValue
	private int customerId;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;

	
	
//	@OneToMany(cascade = CascadeType.ALL,mappedBy = "customer")
//	private List<Food> foodList;
	
	
=======

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
	private List<Food> foodList;

}
