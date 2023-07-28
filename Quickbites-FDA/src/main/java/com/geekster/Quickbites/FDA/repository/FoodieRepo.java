package com.geekster.Quickbites.FDA.repository;

import com.geekster.Quickbites.FDA.model.Foodie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodieRepo extends JpaRepository<Foodie,Long> {
    Foodie findFirstByFoodieEmail(String newEmail);
}
