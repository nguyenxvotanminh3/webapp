package com.movie.web.service.rating;

import com.movie.web.models.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RatingService implements RatingDao {

    private RatingRepo ratingRepo;

    @Autowired
    public RatingService(RatingRepo ratingRepo){
        this.ratingRepo = ratingRepo;
    }
    @Override
    public Rating saveRating(Rating rating) {
        return ratingRepo.save(rating);
    }
}
