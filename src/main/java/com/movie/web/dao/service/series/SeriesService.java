package com.movie.web.dao.service.series;

import com.movie.web.object.VideoSeries;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SeriesService implements SeriesDao {
    SeriesRepo seriesRepo;
    public SeriesService(SeriesRepo seriesRepo){
        this.seriesRepo = seriesRepo;
    }
    @Override
    public Optional<VideoSeries> findById(String theId) {
        return seriesRepo.findById(theId);
    }

    @Override
    public VideoSeries save(VideoSeries videoSeries) {
        return seriesRepo.save(videoSeries);
    }
}
