package com.movie.web.object;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "movie_rating1")
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rating_id",nullable = false)
    public int ratingId;


    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "rating_id_key" )
     public Data data;


    @Column(name = "user_name")
    public String userName;
    @Column(name = "created_at")
    public String created_at;
    @Column(name = "star_amount")
    public String starAmount;


    public Rating(){}

    public Rating(String userName, String created_at, String starAmount) {
        this.userName = userName;
        this.created_at = created_at;
        this.starAmount = starAmount;
    }

    public int getRatingId() {
        return ratingId;
    }

    public void setRatingId(int ratingId) {
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
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
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
                ", created_at='" + created_at + '\'' +
                ", starAmount='" + starAmount + '\'' +
                '}';
    }
}
