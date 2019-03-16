package com.example.navigationdrawer.model;

public class Movie {

    String id;
    String title;
    String overview;
    float voteAverage;
    float voteCount;
    String posterpath;
    String backDropPath;

    public Movie(String id, String title, String overview, float voteAverage, float voteCount, String posterpath, String backDropPath) {
        this.id = id;
        this.title = title;
        this.overview = overview;
        this.voteAverage = voteAverage;
        this.voteCount = voteCount;
        this.posterpath = posterpath;
        this.backDropPath = backDropPath;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public float getVoteAverage() {
        return voteAverage;
    }

    public float getVoteCount() {
        return voteCount;
    }

    public String getPosterpath() {
        return posterpath;
    }

    public String getBackDropPath() {
        return backDropPath;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public void setVoteAverage(float voteAverage) {
        this.voteAverage = voteAverage;
    }

    public void setVoteCount(float voteCount) {
        this.voteCount = voteCount;
    }

    public void setPosterpath(String posterpath) {
        this.posterpath = posterpath;
    }

    public void setBackDropPath(String backDropPath) {
        this.backDropPath = backDropPath;
    }

}
