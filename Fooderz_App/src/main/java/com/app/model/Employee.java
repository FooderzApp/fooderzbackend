package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Employee {
	@Id
	@GeneratedValue
	private int employeeId;
	private String employeeUsername;
	private String employeePassword;
	private String employeeEmail;
}
