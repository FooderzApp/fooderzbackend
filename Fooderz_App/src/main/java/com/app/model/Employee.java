package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
@Table
public class Employee {
	@Id
	@GeneratedValue
	private int employeeId;
	@NotBlank(message = "Please Enter Employee Name")
	@Size(min = 3, message = "Name should be atleast of 3 characters ")
	private String employeeUsername;
	@Size(min = 8, message = "Password Should have atleast 8  characters")
	@Size(max = 16, message = "Password Should have atmost 8  characters")
	private String employeePassword;
	@Email(message = "Entered email is not valid")
	private String employeeEmail;
}
