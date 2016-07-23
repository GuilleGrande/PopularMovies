package com.example.guillermo.popularmovies.data;

/**
 * Created by Guillermo Grande on 23-Jul-16.
 */
public class Movie {

    private int moviePosterId;
    private String movieName;

    public Movie(int moviePosterId, String movieName) {
        this.moviePosterId = moviePosterId;
        this.movieName = movieName;
    }

    public int getMoviePosterId() {
        return moviePosterId;
    }

    public void setMoviePosterId(int moviePosterId) {
        this.moviePosterId = moviePosterId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
