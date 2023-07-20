package com.movie.web.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;


@Entity
@Table(name = "movie_rating1")
public class Rating {
    @Id

    @Column(name = "rating_id")
    public String ratingId;


    @JsonIgnore
    @OneToOne(cascade =CascadeType.ALL)
    @JoinColumn(name = "data_key" )
     public Data data;



    @Column(name = "user_name")
    public String userName;
    @Column(name = "created_at")
    public String createdAt;
    @Column(name = "star_amount")
    public String starAmount;


    public Rating(){}

    public Rating(String ratingId, String userName, String createdAt, String starAmount) {
        this.userName = userName;
        this.createdAt = createdAt;
        this.starAmount = starAmount;
        this.ratingId = ratingId;
    }


    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getRatingId() {
        return ratingId;
    }

    public void setRatingId(String ratingId) {
        this.ratingId = ratingId;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
       this.data = data;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCreated_at() {
        return createdAt;
    }

    public void setCreated_at(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getStarAmount() {
        return starAmount;
    }

    public void setStarAmount(String starAmount) {
        this.starAmount = starAmount;
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
