
package com.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table
@Entity
public class Cart {
	@Id
	@GeneratedValue
	private int cartId;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "customerId")
	private Customer customer;
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "foodId")
	private Food food;
	
}

//package com.app.model;
//
//import javax.persistence.Entity;
//import javax.persistence.Table;
//
//import lombok.Data;
//
//@Data
//@Entity
//@Table
//public class Cart {
////	@Id
////	@GeneratedValue
////	private int cartId;
////	private int customerId;
////	private int foodId;
////
////	@OneToOne
////	@JoinColumn(name = "fooId", referencedColumnName = "fooId")
////	private Food food;
////	@OneToOne
////	@JoinColumn(name = "customerId", referencedColumnName = "customerId")
////	private Customer customer;
//
//}