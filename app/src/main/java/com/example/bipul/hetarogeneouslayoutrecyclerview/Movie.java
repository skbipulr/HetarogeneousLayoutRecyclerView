package com.example.bipul.hetarogeneouslayoutrecyclerview;

public class Movie {
    private String movieName;
    private String movieCategory;

    public Movie(String movieName, String category) {
        this.movieName = movieName;
        this.movieCategory = category;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieCategory() {
        return movieCategory;
    }

    public void setCategory(String category) {
        this.movieCategory = category;
    }
}
