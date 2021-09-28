package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@Entity
@Table
public class Employee {
	@Id
	@GeneratedValue
	@ApiModelProperty(notes = "this is the auto generated id for employee ")
	private int employeeId;
	@NotBlank(message = "Please Enter Employee Name")
	@Size(min = 3, message = "Name should be atleast of 3 characters ")
	@ApiModelProperty(notes = "this is for the name of the employee")
	private String employeeUsername;
	@Size(min = 8, message = "Password Should have atleast 8  characters")
	@Size(max = 16, message = "Password Should have atmost 8  characters")
	@ApiModelProperty(notes = "this for the password of the employee")
	private String employeePassword;
	@Email(message = "Entered email is not valid")
	@ApiModelProperty("this is for the email of the employee")
	private String employeeEmail;
}
