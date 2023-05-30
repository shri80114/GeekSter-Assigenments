package com.resturment.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RestaurantEnity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer number;

	private String restaurantName;
	private String restaurantAddress;
	private Integer totalStaffs;
	private String specialty;

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getRestaurantAddress() {
		return restaurantAddress;
	}

	public void setRestaurantAddress(String restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}

	public Integer getTotalStaffs() {
		return totalStaffs;
	}

	public void setTotalStaffs(Integer totalStaffs) {
		this.totalStaffs = totalStaffs;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	

	public RestaurantEnity(Integer number, String restaurantName, String restaurantAddress, Integer totalStaffs,
			String specialty) {
		super();
		this.number = number;
		this.restaurantName = restaurantName;
		this.restaurantAddress = restaurantAddress;
		this.totalStaffs = totalStaffs;
		this.specialty = specialty;
	}

	public RestaurantEnity() {
		super();
	}

}
