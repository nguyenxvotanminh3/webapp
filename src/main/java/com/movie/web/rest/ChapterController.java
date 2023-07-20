package com.movie.web.rest;

import com.movie.web.service.series.SeriesService;
import com.movie.web.entity.Chapter;
import com.movie.web.entity.VideoSeries;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/api")
public class ChapterController {
    private SeriesService seriesService;
        public ChapterController(SeriesService seriesService){
            this.seriesService = seriesService ;
        }

     @PostMapping("/add_chapter/{theId}")
        public VideoSeries addChapter(@PathVariable String theId, @RequestBody Set<Chapter> chapter){
            Optional<VideoSeries> videoSeries = seriesService.findById(theId) ;
            Set<Chapter> chapters = new HashSet<>();

            for (Chapter chapter1 : chapter){
                chapter1.setVideoSeries(videoSeries.get());
                chapters.add(chapter1);
            }

            videoSeries.get().setChapters(chapters);

            return seriesService.save(videoSeries.get());
        }

}
