package com.app.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	
	
}
