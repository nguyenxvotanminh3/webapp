package com.movie.web.dao.service.videomovie;

import com.movie.web.object.VideoMovie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoMovieRepo extends JpaRepository<VideoMovie , String> {
}
