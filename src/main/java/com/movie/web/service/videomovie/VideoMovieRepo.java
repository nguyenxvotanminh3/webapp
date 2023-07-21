package com.movie.web.service.videomovie;

import com.movie.web.models.VideoMovie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoMovieRepo extends JpaRepository<VideoMovie , String> {
}
