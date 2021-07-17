package com.example.myretrofit2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    MovieViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewModel = new ViewModelProvider(this).get(MovieViewModel.class);
        viewModel.callApiUpcoming();
    }
}