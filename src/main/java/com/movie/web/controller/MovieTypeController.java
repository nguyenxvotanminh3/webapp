package com.movie.web.controller;

import com.movie.web.dto.MovieTypeDTO;

import com.movie.web.service.movietype.MovieServiceImpl;

import com.movie.web.model.MovieType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api/movie")
public class MovieTypeController {
    private MovieServiceImpl movieServiceImpl;

    @Autowired
    public MovieTypeController(MovieServiceImpl movieServiceImpl){
        this.movieServiceImpl = movieServiceImpl;

    }

    @GetMapping("/")
    public List<MovieTypeDTO> getAllFilm(){
        return movieServiceImpl.findAll();

    }


    @GetMapping("/{id}")
    public Stream<MovieTypeDTO> getMovieById(@PathVariable String id){
        return movieServiceImpl.findById(id);
    }


    @PostMapping("/create")
    public MovieType addMovie(@RequestBody MovieType movieType){

        return movieServiceImpl.save(movieType);
    }

    @PutMapping("/update")
    public MovieType updateMovie(@RequestBody MovieType movieType){
        MovieType movieType1 = movieServiceImpl.save(movieType);
        return movieType1;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteMovie(@PathVariable String id){
            Stream<MovieTypeDTO> movieType2 = movieServiceImpl.findById(id);
            if(movieType2 != null){
            movieServiceImpl.deleteById(id);
            return "Deleted movie id: " + id;
            } else  throw new RuntimeException("No movie found");
    }








}


