package com.app.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Customer {
	@Id
	@GeneratedValue
	private int customerid;
	private String firstname;
	private String lastname;
	private String username;
	private String password;
	
	
}
