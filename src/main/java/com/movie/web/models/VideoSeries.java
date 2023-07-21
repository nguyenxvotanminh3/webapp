package com.movie.web.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "video_series1")
public class VideoSeries implements Serializable  {

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

    @Override
    public String toString() {
        return "VideoSeries{" +
                "season='" + season + '\'' +
                '}';
    }
}
