package com.movie.web.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "chapter1")
public class Chapter {
    @Id
    @Column(name = "chapter_id")
    private String chapterId;

    @Column(name = "number")
   private String number;

    @JsonIgnore
    @ManyToOne(cascade = {CascadeType.DETACH , CascadeType.MERGE , CascadeType.PERSIST , CascadeType.REFRESH})
    @JoinColumn(name = "video_key" )
    public VideoSeries videoSeries;
    @Column(name = "url")
   private String url;
    @Column(name = "name")
   private String name;
    @Column(name = "img")
   private String img;
    @Column(name = "description")
   private String description;

    public Chapter(){}
    public Chapter(String chapterId, String number, String url, String name, String img, String description) {
        this.number = number;
        this.chapterId = chapterId;
        this.url = url;
        this.name = name;
        this.img = img;
        this.description = description;
    }

    public String getChapterId() {
        return chapterId;
    }

    public void setChapterId(String chapterId) {
        this.chapterId = chapterId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public VideoSeries getVideoSeries() {
        return videoSeries;
    }

    public void setVideoSeries(VideoSeries videoSeries) {
        this.videoSeries = videoSeries;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "number='" + number + '\'' +
                ", url='" + url + '\'' +
                ", name='" + name + '\'' +
                ", img='" + img + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
