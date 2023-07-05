package com.movie.web.dao.service;

import com.movie.web.dao.MovieRepository;
import com.movie.web.dao.service.data.DataService;
import com.movie.web.dao.service.rating.RatingService;
import com.movie.web.object.Data;
//import com.movie.web.object.MovieType;
import com.movie.web.object.MovieType;
import com.movie.web.object.Rating;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Repository
public class MovieService implements MovieDao {


    public MovieRepository movieRepository;
    public RatingService ratingService;

    public DataService dataService ;

    public MovieService(MovieRepository movieRepository , RatingService ratingService , DataService dataService){
        this.ratingService = ratingService;
        this.movieRepository = movieRepository ;
        this.dataService = dataService;
    }



    @Override
    @Bean
    public List<MovieType> findAll() {
        return movieRepository.findAll() ;
    }

    @Override
    public Optional<MovieType> findById(int theId) {
        return movieRepository.findById(theId);
    }




    @Override
    public MovieType save(MovieType movieType) {
        return movieRepository.save(movieType);
    }

    @Override
    public MovieType updateMovie(MovieType movieType) {
        MovieType movieType1  = movieType;
        return movieRepository.save(movieType1);
    }

    @Override
    public void deleteById(int theId) {
        movieRepository.deleteById(theId);

    }


}
