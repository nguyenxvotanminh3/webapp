package com.movie.web.dao.service;

import com.movie.web.object.MovieType;

import java.util.List;
import java.util.Optional;

public interface MovieDao {



    List<MovieType> findAll();
    Optional<MovieType> findById(int theId);

    MovieType save(MovieType movieType);

    MovieType updateMovie(MovieType movieType);

    void deleteById(int theId);
}
