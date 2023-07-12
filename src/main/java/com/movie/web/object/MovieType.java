package com.movie.web.object;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "movie_type1")
public class MovieType {

    @Id
    @Column(name = "movie_id" )
    public String movieId ;
    @Column(name = "created_at")
    public String createdAt;



    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "data_id_key")
    public Data data;



    @Column(name = "updated_at")
    public String updatedAt;




    public MovieType(){}

    public MovieType(String createdAt, String updatedAt) {
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;

    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "MovieType{" +
                "movieId=" + movieId +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", data=" + data +
                '}';
    }
}