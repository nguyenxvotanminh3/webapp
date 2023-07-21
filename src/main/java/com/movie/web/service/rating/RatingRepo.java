package com.movie.web.service.rating;

import com.movie.web.models.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepo extends JpaRepository<Rating , String> {
}
