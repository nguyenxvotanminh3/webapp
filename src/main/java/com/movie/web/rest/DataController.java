package com.movie.web.rest;

import com.movie.web.dao.service.data.DataService;
import com.movie.web.dao.service.videomovie.VideoMovieService;
import com.movie.web.object.Data;
import com.movie.web.object.Rating;
import com.movie.web.object.VideoMovie;
import com.movie.web.object.VideoSeries;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/api")
public class DataController {

    public DataService dataService;


    public DataController(DataService dataService ){

        this.dataService = dataService;
    }

    @GetMapping("/all")
    public List<Data> getData(){
        return dataService.findAll();
    }


    @PostMapping("/add_videoseries/{theId}")
    public Optional<Data> addVideoSeries(@PathVariable String theId , @RequestBody Set<VideoSeries> videoSeries){
        Optional<Data> data1 = dataService.findById(theId);
        Set<VideoSeries> newVideoSeries = new HashSet<>();
        for(VideoSeries videoSeries1 : videoSeries) {
            videoSeries1.setData(data1.get()); // Set the reference to the parent Data object
            newVideoSeries.add(videoSeries1);
        }
        data1.get().setVideoSeries(newVideoSeries);
        return dataService.save(data1.get());
    }


    @PostMapping("/add_videomovie/{theId}")
    public Optional<Data> addVideoMovie(@PathVariable String theId , @RequestBody Set<VideoMovie> videoMovies){
        Optional<Data> data1 = dataService.findById(theId);
        Set<VideoMovie> newVideoMovie = new HashSet<>();
        for(VideoMovie videoMovie : videoMovies) {
            videoMovie.setData(data1.get()); // Set the reference to the parent Data object
            newVideoMovie.add(videoMovie);
        }
        data1.get().setVideoMovie(newVideoMovie);
        return dataService.save(data1.get());
    }

    @PostMapping("/add_rating/{theId}")
    public Optional<Data> addRating(@PathVariable String theId , @RequestBody Set<Rating> ratings){
        Optional<Data> data1 = dataService.findById(theId);
        Set<Rating> newRatings = new HashSet<>();
        for(Rating rating : ratings) {
            rating.setData(data1.get()); // Set the reference to the parent Data object
            newRatings.add(rating);
        }
        data1.get().setRating(newRatings);
        return dataService.save(data1.get());
    }


    @PutMapping ("/update_data")
    public Optional<Data> updateData(@RequestBody Data data){

        Optional<Data> data1 = dataService.save(data);
        return data1;
    }
}
