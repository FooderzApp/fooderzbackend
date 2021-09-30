
package com.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@Table
@Entity

//@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty()
	private int cartId;

	@OneToOne//(//cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_fk")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Customer customer;
	
	
	@OneToMany(mappedBy = "cart")//(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private List<Food> foodList;

}
