package com.movie.web.service.series;

import com.movie.web.entity.VideoSeries;

import java.util.Optional;

public interface SeriesDao {
  public  Optional<VideoSeries> findById(String theId);

  public  VideoSeries save(VideoSeries videoSeries);

}
