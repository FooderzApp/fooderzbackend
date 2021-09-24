package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Food;
import com.app.repository.FoodRepository;
import com.app.service.FoodService;
@Service
public class FoodServiceImpl implements FoodService {

	@Autowired
	private FoodRepository repository;
	
	@Override
	public Food addFood(Food food) {
		// TODO Auto-generated method stub
		return repository.save(food);
	}

	@Override
	public void deleteFood(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public List<Food> getAllFoods() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}


}
