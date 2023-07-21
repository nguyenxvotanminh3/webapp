package com.movie.web.service.movietype;

import com.movie.web.dto.MovieTypeDTO;
import com.movie.web.models.MovieType;

import java.util.List;
import java.util.stream.Stream;

public interface MovieDao {



    List<MovieTypeDTO> findAll();
    Stream<MovieTypeDTO> findById(String theId);

    MovieType save(MovieType movieType);

    MovieType updateMovie(MovieType movieType);

    void deleteById(String theId);
}
