package com.movie.web.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "video_movie1")
public class VideoMovie {

    @Id
    @Column(name = "video_id")
    private String videoId;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "data_key")
    public Data data;
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

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
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
