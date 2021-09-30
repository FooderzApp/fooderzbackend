//package com.app.controller;
//
//import static org.junit.Assert.assertEquals;
//import static org.mockito.Mockito.when;
//
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import com.app.model.Food;
//import com.app.repository.FoodRepository;
//import com.app.service.FoodService;
//
//class FoodControllerTest {
//
//	@Autowired
//	private FoodService service;
//
//	@MockBean
//	private FoodRepository repository;
//
////	@Test
////	void testAddFood() {
////		Food food = new Food(1, "IDLI", 40.0, "abcd");
////		when(repository.save(food)).thenReturn(food);
////		assertEquals(food, service.addFood(food));
////
////	}
//
////	@Test
////	void testDeleteFood() {
////		Food food = new Food(1, "IDLI", 20, "abcd");
////		food.setFoodId(1);
////		service.deleteFood(food.getFoodId());
////		verify(repository, times(1)).de
////	}
//
//	@Test
//	void testGetAllFoods() {
//		when(repository.findAll())
//				.thenReturn(Stream.of(new Food(1, "IDLI", 40, "abcd"), new Food(1, "Biryani", 80.0, "wxyz"))
//						.collect(Collectors.toList()));
//		assertEquals(2, service.getAllFoods().size());
//	}
//
////	@Test
////	void testGetFoodById() {
////		int id = 1;
////		when(repository.findById(id))
////				.thenReturn(Stream.of(new Food(1, "abc", 20.0, "xyz")).collect(Collectors.toList()));
////	}
//
//}
