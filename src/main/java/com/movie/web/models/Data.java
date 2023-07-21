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
@Table(name = "movie_data1")
public class Data  implements Serializable  {
    @Id
    @Column(name = "data_id")
    public String dataId;



    @JsonIgnore
    @OneToOne(mappedBy = "data",cascade = CascadeType.ALL, orphanRemoval = true)
    public MovieType movieType;

    @OneToMany(mappedBy = "data",cascade = CascadeType.ALL, orphanRemoval = true)
    public Set<VideoSeries> videoSeries;


    @OneToMany(mappedBy = "data",cascade = CascadeType.ALL, orphanRemoval = true)
    public Set<VideoMovie> videoMovie;


    @OneToMany(mappedBy = "data",cascade = CascadeType.ALL, orphanRemoval = true)
    public Set<Rating> rating;

    @Column(name = "img")
    public String img;
    @Column(name = "time_demain")
    public String timeDemain;
    @Column(name = "trailer_vid")
    public String[] trailerVid;

    @Column(name = "name")
    public String name;

    @Column(name = "description")
    public String description;

    @Column(name = "feature_img")
    public String featureImg;

    @Column(name = "feature_vid")
    public String featureVid;
    @Column(name = "country")
    public String country;

    @Column(name = "type")
    public String type;

    @Column(name = "genre")
    public String[] genre;

    @Column(name = "release")
    public String release;
    @Column(name = "director")
    public String director ;
    @Column(name = "casts")
    public String casts;
    @Column(name = "production" )
    public String production;

    public Data(){}

    public Data(String dataId,String img, String timeDemain, String[] trailerVid, String name, String description, String featureImg, String featureVid, String country, String type, String[] genre, String release, String director, String casts, String production) {
        this.img = img;
        this.dataId = dataId;
        this.timeDemain = timeDemain;
        this.trailerVid = trailerVid;
        this.name = name;
        this.description = description;
        this.featureImg = featureImg;
        this.featureVid = featureVid;
        this.country = country;
        this.type = type;
        this.genre = genre;
        this.release = release;
        this.director = director;
        this.casts = casts;
        this.production = production;
    }

    @Override
    public String toString() {
        return "Data{" +
                "dataId=" + dataId +
                ", rating=" + rating +
                ", img='" + img + '\'' +
                ", timeDemain='" + timeDemain + '\'' +
                ", trailerVid='" + trailerVid + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", feature_img='" + featureImg + '\'' +
                ", feature_vid='" + featureVid + '\'' +
                ", country='" + country + '\'' +
                ", type='" + type + '\'' +
                ", genre='" + genre + '\'' +
                ", realease='" + release + '\'' +
                ", director='" + director + '\'' +
                ", casts='" + casts + '\'' +
                ", production='" + production + '\'' +
                '}';
    }
}
