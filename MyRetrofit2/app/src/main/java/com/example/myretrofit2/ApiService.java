package com.example.myretrofit2;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
        @GET("movie/upcoming")
        Call<UpcomingMovieResponseModel> upcomingMovie(@Query("api_key") String key,
                                                   @Query("page") int page);
}
