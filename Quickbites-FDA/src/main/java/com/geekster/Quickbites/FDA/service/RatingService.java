package com.geekster.Quickbites.FDA.service;


import com.geekster.Quickbites.FDA.model.Rating;
import com.geekster.Quickbites.FDA.repository.RatingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class RatingService {
    @Autowired
    RatingRepo ratingRepo;
    public Rating addRating(Rating rating) {
        return ratingRepo.save(rating);
    }
    public Optional<Rating> findRatingsById(Long id) {
        return ratingRepo.findById(id);
    }
}
