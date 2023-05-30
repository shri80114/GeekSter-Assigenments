package com.resturment.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.resturment.beans.RestaurantEnity;

@Repository
public interface RestaurantDAO extends CrudRepository<RestaurantEnity, Integer>{


}
