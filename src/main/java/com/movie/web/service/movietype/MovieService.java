package com.movie.web.service.movietype;

import com.movie.web.dto.MovieTypeDTO;
import com.movie.web.model.MovieType;

import java.util.List;
import java.util.stream.Stream;

public interface MovieService {


    List<MovieTypeDTO> findAll();
    Stream<MovieTypeDTO> findById(String theId);

    MovieType save(MovieType movieType);

    MovieType updateMovie(MovieType movieType);

    void deleteById(String theId);
   
}
