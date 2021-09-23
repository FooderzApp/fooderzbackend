package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Food {
	@Id
	@GeneratedValue
	private int food_id;
	private String foodName;
	private double price;
	
}
