package com.movie.web.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "chapter1")
public class Chapter implements Serializable {
    @Id
    @Column(name = "chapter_id")
    private String chapterId;

    @Column(name = "number")
   private String number;

    @JsonIgnore
    @ManyToOne(cascade = {CascadeType.DETACH , CascadeType.MERGE , CascadeType.PERSIST , CascadeType.REFRESH})
    @JoinColumn(name = "video_key" )
    private VideoSeries videoSeries;
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
