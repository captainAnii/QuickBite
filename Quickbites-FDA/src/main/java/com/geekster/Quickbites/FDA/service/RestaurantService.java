package com.geekster.Quickbites.FDA.service;

import com.geekster.Quickbites.FDA.model.Restaurant;
import com.geekster.Quickbites.FDA.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepo restaurantRepo;
    public Restaurant addRestaurant(Restaurant restaurant) {
        return restaurantRepo.save(restaurant);
    }
    public void deleteRestaurant(Long id) {
        restaurantRepo.deleteById(id);
    }
    public List<Restaurant> getAllRestaurants() {
        return restaurantRepo.findAll();
    }
}
