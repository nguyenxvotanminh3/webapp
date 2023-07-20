package com.movie.web.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "video_series1")
public class VideoSeries {

    @Id
    @Column(name = "series_id")
    private String seriesId;

    @Column(name = "season")
    private String season;

    @OneToMany(mappedBy = "videoSeries",cascade = CascadeType.ALL)
    public Set<Chapter> chapters;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @JsonIgnore
    @ManyToOne(cascade = {CascadeType.DETACH ,CascadeType.MERGE , CascadeType.PERSIST , CascadeType.REFRESH})
    @JoinColumn(name = "data_key")
    public Data data;
    public  VideoSeries (){}

    public VideoSeries(String seriesId,String season) {
        this.seriesId = seriesId;
        this.season = season;
    }

    public String getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(String seriesId) {
        this.seriesId = seriesId;
    }

    public Set<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(Set<Chapter> chapters) {
        this.chapters = chapters;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return "VideoSeries{" +
                "season='" + season + '\'' +
                '}';
    }
}
