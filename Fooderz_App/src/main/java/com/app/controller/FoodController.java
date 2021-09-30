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

import com.app.exception.ResourceNotFoundException;
import com.app.model.Food;
import com.app.repository.FoodRepository;
import com.app.service.FoodService;

import io.swagger.annotations.Api;

@Api(description = "operation for the food model class")
@RestController
@CrossOrigin
public class FoodController {

	@Autowired
	private FoodRepository repository;

	@PostMapping("/food")
	public Food addFood(@RequestBody Food food) {
		// TODO Auto-generated method stub
		return repository.save(food);
	}

	@DeleteMapping("/food/{id}")
	public void deleteFood(@PathVariable int id) {
		// TODO Auto-generated method stub
		Food existingFood=this.repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("food with this id is not avaible" + id));
		repository.delete(existingFood);

	}

	@GetMapping("/food")
	public List<Food> getAllFoods() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@GetMapping("/food/{id}")
	public Food getFoodById(@PathVariable int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

}
