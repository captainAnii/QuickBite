package com.geekster.Quickbites.FDA.repository;

import com.geekster.Quickbites.FDA.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepo extends JpaRepository<Rating,Long> {
}
