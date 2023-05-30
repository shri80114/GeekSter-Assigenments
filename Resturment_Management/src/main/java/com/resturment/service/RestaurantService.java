package com.resturment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resturment.DAO.RestaurantDAO;
import com.resturment.beans.RestaurantEnity;

@Service
public class RestaurantService {

	@Autowired
	RestaurantDAO restaurantdao;

	public Optional<RestaurantEnity> findById(Integer Id) {
		return restaurantdao.findById(Id);
	}

	public List<RestaurantEnity> getAllRestaurant() {
		return (List<RestaurantEnity>) restaurantdao.findAll();
	}

	public void saveRestaurant(RestaurantEnity entity) {
		restaurantdao.save(entity);
	}

	public void updateInformation(RestaurantEnity entity) {
		restaurantdao.save(entity);
		System.out.println("Update Data Sucessfully");
	}

	public void deleteInfomation(Integer Id) {
		restaurantdao.deleteById(Id);
	}
}
