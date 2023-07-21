package com.movie.web.dto;

import com.movie.web.models.MovieType;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class MovieTypeDtoMapper implements Function<MovieType , MovieTypeDTO> {


    @Override
    public MovieTypeDTO apply(MovieType movieType) {
        return new MovieTypeDTO(
                movieType.getMovieId(),
                movieType.getCreatedAt(),
                movieType.getData(),
                movieType.getUpdatedAt()
        );
    }
}
