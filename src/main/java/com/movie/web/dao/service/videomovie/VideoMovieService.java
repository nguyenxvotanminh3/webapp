package com.movie.web.dao.service.videomovie;

import com.movie.web.object.VideoMovie;

public class VideoMovieService implements VideoMovieDao {
    VideoMovieRepo videoMovieRepo;
    @Override
    public VideoMovie save(VideoMovie videoMovie) {
        return videoMovieRepo.save(videoMovie);
    }
}
