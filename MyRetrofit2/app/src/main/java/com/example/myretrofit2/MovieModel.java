package com.example.myretrofit2;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieModel {
    boolean results;
    @SerializedName("backdrop_path")
    String backdropPath;
    @SerializedName("genre_ids")
    List<Integer> genreIds;
    int id;
    @SerializedName("original_language")
    String originaLanguage;
    @SerializedName("original_title")
    String originalTitle;
    float popularity;
    @SerializedName("poster_path")
    String posterPath;
    @SerializedName("release_date")
    String releaseDate;
    String title;
    boolean video;
    @SerializedName("vote_average")
    float voteAverage;
    @SerializedName("vote_count")
    int voteCount;
}



