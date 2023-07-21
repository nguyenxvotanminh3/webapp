package com.movie.web.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "video_movie1")
public class VideoMovie implements Serializable {

    @Id
    @Column(name = "video_id")
    private String videoId;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "data_key")
    private Data data;
    @Column(name = "season")
    private String season;
    @Column(name = "url")
    private String url;
    @Column(name = "name")
    private String name;
    @Column(name = "img")
    private String img;
    @Column(name = "description")
    private String description;

    public VideoMovie(){}

    public VideoMovie(String videoId, String season, String url, String name, String img, String description) {
        this.videoId = videoId;
        this.season = season;
        this.url = url;
        this.name = name;
        this.img = img;
        this.description = description;
    }

    @Override
    public String toString() {
        return "VideoMovie{" +
                "videoId='" + videoId + '\'' +
                ", season='" + season + '\'' +
                ", url='" + url + '\'' +
                ", name='" + name + '\'' +
                ", img='" + img + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
