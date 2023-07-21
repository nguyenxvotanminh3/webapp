package com.movie.web.controller;

import com.movie.web.service.data.DataServiceImpl;
import com.movie.web.model.Data;
import com.movie.web.model.Rating;
import com.movie.web.model.VideoMovie;
import com.movie.web.model.VideoSeries;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/api")
public class DataController {

    public DataServiceImpl dataServiceImpl;


    public DataController(DataServiceImpl dataServiceImpl){

        this.dataServiceImpl = dataServiceImpl;
    }

    @PostMapping("/videoseries/{id}")
    public Optional<Data> addVideoSeries(@PathVariable String id , @RequestBody Set<VideoSeries> videoSeries){
        Optional<Data> data1 = dataServiceImpl.findById(id);
        Set<VideoSeries> newVideoSeries = new HashSet<>();
        for(VideoSeries videoSeries1 : videoSeries) {
            videoSeries1.setData(data1.get()); // Set the reference to the parent Data object
            newVideoSeries.add(videoSeries1);
        }
        data1.get().setVideoSeries(newVideoSeries);
        return dataServiceImpl.save(data1.get());
    }


    @PostMapping("/videomovie/{id}")
    public Optional<Data> addVideoMovie(@PathVariable String id , @RequestBody Set<VideoMovie> videoMovies){
        Optional<Data> data1 = dataServiceImpl.findById(id);
        Set<VideoMovie> newVideoMovie = new HashSet<>();
        for(VideoMovie videoMovie : videoMovies) {
            videoMovie.setData(data1.get()); // Set the reference to the parent Data object
            newVideoMovie.add(videoMovie);
        }
        data1.get().setVideoMovie(newVideoMovie);
        return dataServiceImpl.save(data1.get());
    }

    @PostMapping("/rating/{id}")
    public Optional<Data> addRating(@PathVariable String id , @RequestBody Set<Rating> ratings){
        Optional<Data> data1 = dataServiceImpl.findById(id);
        Set<Rating> newRatings = new HashSet<>();
        for(Rating rating : ratings) {
            rating.setData(data1.get()); // Set the reference to the parent Data object
            newRatings.add(rating);
        }
        data1.get().setRating(newRatings);
        return dataServiceImpl.save(data1.get());
    }


    @PutMapping ("/update_data")
    public Optional<Data> updateData(@RequestBody Data data){

        Optional<Data> data1 = dataServiceImpl.save(data);
        return data1;
    }
}
