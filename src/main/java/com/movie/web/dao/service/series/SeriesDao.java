package com.movie.web.dao.service.series;

import com.movie.web.object.VideoSeries;

import java.util.Optional;

public interface SeriesDao {
  public  Optional<VideoSeries> findById(String theId);

  public  VideoSeries save(VideoSeries videoSeries);

}
