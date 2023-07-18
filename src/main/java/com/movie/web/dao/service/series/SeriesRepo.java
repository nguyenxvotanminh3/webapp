package com.movie.web.dao.service.series;

import com.movie.web.object.VideoSeries;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeriesRepo extends JpaRepository<VideoSeries, String> {
}
