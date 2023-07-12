package com.movie.web.dao.service.rating;

import com.movie.web.object.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepo extends JpaRepository<Rating , String> {
}
