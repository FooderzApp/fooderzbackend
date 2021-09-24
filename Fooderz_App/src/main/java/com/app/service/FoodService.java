package com.app.service;

import java.util.List;

import com.app.model.Food;

public interface FoodService {

		Food addFood(Food food);
		void deleteFood(int id);
		List<Food> getAllFoods();
		
	
}
