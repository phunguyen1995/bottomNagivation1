package com.example.myretrofit2;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MovieViewModel extends ViewModel {
    MutableLiveData<List<UpcomingMovieResponseModel>> data = new MutableLiveData<>();
    public void callApiUpcoming(){
        Call<UpcomingMovieResponseModel> call = MyRetrofit2.instance()
                .upcomingMovie("815a6f9dd2d23555eea10e012a14deac", 1);
        call.enqueue(new Callback<UpcomingMovieResponseModel>() {
            @Override
            public void onResponse(Call<UpcomingMovieResponseModel> call, Response<UpcomingMovieResponseModel> response) {
                Log.e("", " ");
            }

            @Override
            public void onFailure(Call<UpcomingMovieResponseModel> call, Throwable t) {
                Log.e("", " ");
            }
        });

    }
}
