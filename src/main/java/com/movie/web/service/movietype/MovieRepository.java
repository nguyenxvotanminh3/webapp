package com.movie.web.service.movietype;

import com.movie.web.models.MovieType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories

public interface MovieRepository extends JpaRepository<MovieType, String> {

}
