package com.movie.web.rest;

import com.movie.web.dto.MovieTypeDTO;

import com.movie.web.service.movietype.MovieService;

import com.movie.web.models.MovieType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api")
public class MovieTypeController {
    private MovieService movieService;

    @Autowired
    public MovieTypeController(MovieService movieService ){
        this.movieService = movieService;

    }

    @GetMapping("/movie")
    public List<MovieTypeDTO> getAllFilm(){
        return movieService.findAll();

    }


    @GetMapping("/movie/{theId}")
    public Stream<MovieTypeDTO> getMovieById(@PathVariable String theId){
        return movieService.findById(theId);
    }


    @PostMapping("/add_movie")
    public MovieType addMovie(@RequestBody MovieType movieType){

        return movieService.save(movieType);
    }

    @PutMapping("/update_movie")
    public MovieType updateMovie(@RequestBody MovieType movieType){
        MovieType movieType1 = movieService.save(movieType);
        return movieType1;
    }

    @DeleteMapping("/delete_movie/{theId}")
    public String deleteMovie(@PathVariable String theId){
            Stream<MovieTypeDTO> movieType2 = movieService.findById(theId);
            if(movieType2 != null){
            movieService.deleteById(theId);
            return "Deleted movie id: " + theId;
            } else  throw new RuntimeException("No movie found");
    }








}


