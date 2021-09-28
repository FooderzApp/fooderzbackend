package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table
public class Food {
	@Id
	@GeneratedValue
	private int foodId;
	private String foodName;
	private double price;

	@Lob
	@Column(columnDefinition = "CLOB")
	private String avatar;
	


//
//	@JsonIgnore
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "customerId", referencedColumnName = "customerId")
//	private Customer customer;

}
