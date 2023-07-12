package com.movie.web.object;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Collection;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "movie_data1")
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "data_id")
    public int dataId;



    @JsonIgnore
    @OneToOne(mappedBy = "data",cascade = CascadeType.ALL)
    public MovieType movieType;


    @OneToMany(mappedBy = "data",cascade = CascadeType.ALL)
    public Set<Rating> rating;

    @Column(name = "img")
    public String img;
    @Column(name = "time_demain")
    public String timeDemain;
    @Column(name = "trailer_vid")
    public String trailerVid;

    @Column(name = "name")
    public String name;

    @Column(name = "description")
    public String description;

    @Column(name = "feature_img")
    public String feature_img;

    @Column(name = "feature_vid")
    public String feature_vid;
    @Column(name = "country")
    public String country;

    @Column(name = "type")
    public String type;

    @Column(name = "gerne")
    public String gerne;

    @Column(name = "realease",nullable = false)
    public String realease;
    @Column(name = "director",nullable = false)
    public String director ;
    @Column(name = "casts",nullable = false)
    public String casts;
    @Column(name = "production",nullable = false )
    public String production;

    public Data(){}

    public Data(String img, String timeDemain, String trailerVid, String name, String description, String feature_img, String feature_vid, String country, String type, String gerne, String realease, String director, String casts, String production) {
        this.img = img;

        this.timeDemain = timeDemain;
        this.trailerVid = trailerVid;
        this.name = name;
        this.description = description;
        this.feature_img = feature_img;
        this.feature_vid = feature_vid;
        this.country = country;
        this.type = type;
        this.gerne = gerne;
        this.realease = realease;
        this.director = director;
        this.casts = casts;
        this.production = production;
    }


    public int getDataId() {
        return dataId;
    }

    public void setDataId(int dataId) {
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

    public String getTrailerVid() {
        return trailerVid;
    }

    public void setTrailerVid(String trailerVid) {
        this.trailerVid = trailerVid;
    }

//    public MovieType getMovieType() {
//        return movieType;
//    }
//
//    public void setMovieType(MovieType movieType) {
//        this.movieType = movieType;
//    }



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

    public String getFeature_img() {
        return feature_img;
    }

    public void setFeature_img(String feature_img) {
        this.feature_img = feature_img;
    }

    public String getFeature_vid() {
        return feature_vid;
    }

    public void setFeature_vid(String feature_vid) {
        this.feature_vid = feature_vid;
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

    public String getGerne() {
        return gerne;
    }

    public void setGerne(String gerne) {
        this.gerne = gerne;
    }

    public String getRealease() {
        return realease;
    }

    public void setRealease(String realease) {
        this.realease = realease;
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
//                ", movieType=" + movieType +
                ", rating=" + rating +
                ", img='" + img + '\'' +
                ", timeDemain='" + timeDemain + '\'' +
                ", trailerVid='" + trailerVid + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", feature_img='" + feature_img + '\'' +
                ", feature_vid='" + feature_vid + '\'' +
                ", country='" + country + '\'' +
                ", type='" + type + '\'' +
                ", gerne='" + gerne + '\'' +
                ", realease='" + realease + '\'' +
                ", director='" + director + '\'' +
                ", casts='" + casts + '\'' +
                ", production='" + production + '\'' +
                '}';
    }
}
