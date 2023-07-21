package com.movie.web.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Entity
@Getter
@Setter
@Table(name = "movie_rating1")
public class Rating implements Serializable {
    @Id

    @Column(name = "rating_id")
    private String ratingId;


    @JsonIgnore
    @OneToOne(cascade =CascadeType.ALL)
    @JoinColumn(name = "data_key" )
    private Data data;



    @Column(name = "user_name")
    private String userName;
    @Column(name = "created_at")
    private String createdAt;
    @Column(name = "star_amount")
    private String starAmount;


    public Rating(){}

    public Rating(String ratingId, String userName, String createdAt, String starAmount) {
        this.userName = userName;
        this.createdAt = createdAt;
        this.starAmount = starAmount;
        this.ratingId = ratingId;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "ratingId=" + ratingId +
//                ", data=" + data +
                ", userName='" + userName + '\'' +
                ", created_at='" + createdAt + '\'' +
                ", starAmount='" + starAmount + '\'' +
                '}';
    }
}
