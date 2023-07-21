package com.movie.web.service.series;

import com.movie.web.models.VideoSeries;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeriesRepo extends JpaRepository<VideoSeries, String> {
}
