package com.movie.web.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;


@Entity
@Table(name = "movie_data1")
public class Data {
    @Id
    @Column(name = "data_id")
    public String dataId;



    @JsonIgnore
    @OneToOne(mappedBy = "data",cascade = CascadeType.ALL)
    public MovieType movieType;

    @OneToMany(mappedBy = "data",cascade = CascadeType.ALL)
    public Set<VideoSeries> videoSeries;


    @OneToMany(mappedBy = "data",cascade = CascadeType.ALL)
    public Set<VideoMovie> videoMovie;


    @OneToMany(mappedBy = "data",cascade = CascadeType.ALL)
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

    public MovieType getMovieType() {
        return movieType;
    }

    public void setMovieType(MovieType movieType) {
        this.movieType = movieType;
    }

    public Set<VideoSeries> getVideoSeries() {
        return videoSeries;
    }

    public void setVideoSeries(Set<VideoSeries> videoSeries) {
        this.videoSeries = videoSeries;
    }

    public Set<VideoMovie> getVideoMovie() {
        return videoMovie;
    }

    public void setVideoMovie(Set<VideoMovie> videoMovie) {
        this.videoMovie = videoMovie;
    }

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTimeDemain() {
        return timeDemain;
    }

    public void setTimeDemain(String timeDemain) {
        this.timeDemain = timeDemain;
    }

    public String[] getTrailerVid() {
        return trailerVid;
    }

    public void setTrailerVid(String[] trailerVid) {
        this.trailerVid = trailerVid;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFeatureImg() {
        return featureImg;
    }

    public void setFeatureImg(String featureImg) {
        this.featureImg = featureImg;
    }

    public String getFeatureVid() {
        return featureVid;
    }

    public void setFeatureVid(String featureVid) {
        this.featureVid = featureVid;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getGenre() {
        return genre;
    }

    public void setGenre(String[] genre) {
        this.genre = genre;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCasts() {
        return casts;
    }

    public void setCasts(String casts) {
        this.casts = casts;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public Set<Rating> getRating() {
        return rating;
    }

    public void setRating(Set<Rating> rating) {
        this.rating = rating;
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
