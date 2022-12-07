package com.example.The_Spring_Cinema.models;
import javax.persistence.*;

@Entity(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "rating")
    private String rating;
    @Column(name = "title")
    private String title;
    @Column(name = "duration")
    private int duration;
    public Movie(String rating, String title, int duration){
        this.rating = rating;
        this.title = title;
        this.duration = duration;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
