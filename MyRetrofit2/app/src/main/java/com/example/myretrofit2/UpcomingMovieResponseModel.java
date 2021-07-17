package com.example.myretrofit2;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UpcomingMovieResponseModel {
    int page;
    @SerializedName("total_pages")
    int totalPages;
    @SerializedName("total_results")
    int totalResults;
    List<MovieModel> results;
}
