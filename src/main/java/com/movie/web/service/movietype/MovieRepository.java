package com.movie.web.service.movietype;

import com.movie.web.entity.MovieType;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MovieRepository extends JpaRepository<MovieType, String> {

}
