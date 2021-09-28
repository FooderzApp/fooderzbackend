package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@Entity
@Table
public class Customer {
	@Id
	@GeneratedValue
	@ApiModelProperty(notes = "this is the auto generated id for customer by the database ")
	private int customerId;
	@ApiModelProperty(notes = "this is for the customer first name")
	private String firstName;
	@ApiModelProperty(notes = "this is for the customer last name")
	private String lastName;
	@ApiModelProperty(notes = "this is for the customer email")
	private String userName;
	@ApiModelProperty(notes = "this is for the customer password")
	private String password;

//	@ApiModelProperty(notes = "this is the relationship between customer and food model class")
//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
//	private List<Food> foodList;

}
