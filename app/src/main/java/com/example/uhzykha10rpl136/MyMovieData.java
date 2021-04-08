package com.example.uhzykha10rpl136;

public class MyMovieData {

    private String movieName;
    private String movieRating;
    private Integer movieImage;

    public MyMovieData(String movieName, String movieRating, Integer movieImage) {
        this.movieName = movieName;
        this.movieRating = movieRating;
        this.movieImage = movieImage; }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(String movieRating) {
        this.movieRating = movieRating;
    }

    public Integer getMovieImage() {
        return movieImage;
    }

    public void setMovieImage(Integer movieImage) {
        this.movieImage = movieImage;
    }
}
