package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Food;
import com.app.service.FoodService;

@CrossOrigin
@RestController
@CrossOrigin
public class FoodController  {

	@Autowired
	private FoodService service;

	@PostMapping("/food")
	public Food addFood(@RequestBody Food food) {
		// TODO Auto-generated method stub
		return service.addFood(food);
	}

	@DeleteMapping("/food/{id}")
	public void deleteFood(@PathVariable int id) {
		// TODO Auto-generated method stub
		service.deleteFood(id);

	}

	@GetMapping("/food")
	public List<Food> getAllFoods() {
		// TODO Auto-generated method stub
		return service.getAllFoods();
	}

	@GetMapping("/food/{id}")
	public Food getFoodById(@PathVariable int id) {
		// TODO Auto-generated method stub
		return service.getFoodById(id);
	}

}
