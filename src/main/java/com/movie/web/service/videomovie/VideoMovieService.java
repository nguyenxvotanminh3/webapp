package com.movie.web.service.videomovie;

import com.movie.web.models.VideoMovie;

public class VideoMovieService implements VideoMovieDao {
    VideoMovieRepo videoMovieRepo;
    @Override
    public VideoMovie save(VideoMovie videoMovie) {
        return videoMovieRepo.save(videoMovie);
    }
}
