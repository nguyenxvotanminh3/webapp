package com.movie.web.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "movie_type1")
public class MovieType implements Serializable  {

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

    public MovieType(String movieId,String createdAt, String updatedAt) {
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.movieId = movieId;
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
