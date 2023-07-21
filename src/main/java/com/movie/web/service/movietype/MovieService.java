package com.movie.web.service.movietype;

import com.movie.web.dto.MovieTypeDtoMapper;
import com.movie.web.service.data.DataService;
import com.movie.web.service.rating.RatingService;
import com.movie.web.dto.MovieTypeDTO;
//import com.movie.web.object.MovieType;
import com.movie.web.models.MovieType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@Repository
public class MovieService implements MovieDao {

@Autowired
    public MovieRepository movieRepository;
    public RatingService ratingService;

    public MovieTypeDtoMapper movieTypeDtoMapper;
    public DataService dataService ;

    public MovieService(MovieRepository movieRepository, MovieTypeDtoMapper movieTypeDtoMapper , RatingService ratingService , DataService dataService){
        this.ratingService = ratingService;
        this.movieRepository = movieRepository ;
        this.dataService = dataService;
        this.movieTypeDtoMapper = movieTypeDtoMapper;
    }



    @Override
    @Bean
    public List<MovieTypeDTO> findAll() {
        return movieRepository.findAll().stream().map(movieTypeDtoMapper)
                .collect(Collectors.toList());
    }

    @Override
    public Stream<MovieTypeDTO> findById(String theId) {
        Optional<MovieType> movieType = movieRepository.findById(theId);
        if(movieType.isPresent()){
            return movieRepository.findById(theId).stream().map(movieTypeDtoMapper); }
        else {
            throw new RuntimeException("No Movie Found");
        }

    }

    @Override
    public MovieType save(MovieType movieType) {
        return movieRepository.save(movieType);
    }

    @Override
    public MovieType updateMovie(MovieType movieType) {
        MovieType movieType1 = save(movieType) ;
        return movieType;
    }

    @Override
    public void deleteById(String theId) {
        movieRepository.deleteById(theId);

    }


}
