package com.movie.web.rest;


//import com.movie.web.dao.service.MovieService;
import com.movie.web.dao.service.MovieService;
//import com.movie.web.object.MovieType;
import com.movie.web.object.MovieType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MovieTypeController {
        private MovieService movieService;


        @Autowired
        public MovieTypeController(MovieService movieService){
            this.movieService = movieService;
        }

        @GetMapping("/movie")
    public List<MovieType> getAllFilm(){
        return movieService.findAll();
    }


    @GetMapping("/movie/{theId}")
    public Optional<MovieType> getMovieById(@PathVariable int theId){
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

    @DeleteMapping("/delete_movie")
    public String deleteMovie(@PathVariable int theId){
            Optional<MovieType> movieType2 = movieService.findById(theId);
            if(movieType2.isPresent()){
            movieService.deleteById(theId);
            return "Deleted movie id: " + theId;
            } else  throw new RuntimeException("No movie found");
    }








}


