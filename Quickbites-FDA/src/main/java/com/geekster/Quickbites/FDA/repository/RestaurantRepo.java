package com.geekster.Quickbites.FDA.repository;

import com.geekster.Quickbites.FDA.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepo extends JpaRepository<Restaurant,Long> {
}
