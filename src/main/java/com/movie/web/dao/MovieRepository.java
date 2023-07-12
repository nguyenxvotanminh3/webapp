package com.movie.web.dao;

import com.movie.web.object.MovieType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface MovieRepository extends JpaRepository<MovieType, String> {

}
