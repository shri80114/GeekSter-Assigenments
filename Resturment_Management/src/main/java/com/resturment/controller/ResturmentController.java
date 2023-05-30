package com.resturment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resturment.beans.RestaurantEnity;
import com.resturment.service.RestaurantService;

@RestController
@RequestMapping("/Reataurant")
public class ResturmentController {

	@Autowired
	RestaurantService restaurantService;

	@GetMapping("/getRestaurantById/{number}")
	public Optional<RestaurantEnity> findById(@PathVariable("number") Integer Id) {
		return restaurantService.findById(Id);
	}
	
	@GetMapping("/getAllReataurant")
	public List<RestaurantEnity> getAllRestaurant()
	{
		return restaurantService.getAllRestaurant();
	}
	
	@PostMapping("/saveRestaurant")
	public void saveRestaurant(@RequestBody RestaurantEnity entity)
	{
		System.out.println("============");
		restaurantService.saveRestaurant(entity);
	}
	
	@PutMapping("/updateInformation")
	public void updateInfomation(@RequestBody RestaurantEnity entity)
	{
		restaurantService.updateInformation(entity);
	}
	
	@DeleteMapping("/deleteRestaurant/{number}")
	public void deleteRestaurant(@PathVariable("number") Integer Id)
	{
		restaurantService.deleteInfomation(Id);
	}

}
