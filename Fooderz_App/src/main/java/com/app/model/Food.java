package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table
@NoArgsConstructor
//@AllArgsConstructor
public class Food {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(notes = "this is the auto generated foodId which was generated by the database itself ")
	private int foodId;
	@ApiModelProperty(notes = "this is for the name of the food  ")
	private String foodName;
	@ApiModelProperty(notes = "this is for the price of the food ")
	private double price;

	@Lob
	@Column(columnDefinition = "CLOB")
	@ApiModelProperty(notes = "this is for the image of the food")
	private String avatar;

	public Food(int foodId, String foodName, double price, String avatar) {
		super();
		this.foodId = foodId;
		this.foodName = foodName;
		this.price = price;
		this.avatar = avatar;
	}

	
	
	
	
	
	
	
	
	
//	public Food(int foodId, String foodName, double price, String avatar) {
//		super();
//		this.foodId = foodId;
//		this.foodName = foodName;
//		this.price = price;
//		this.avatar = avatar;
//	}


//	@ManyToOne
//	@JoinColumn(name = "cart_fk")
//	private Cart cart;

}
