package com.example.mysharepreferemces;

import androidx.activity.result.ActivityResultRegistry;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mysharepreferemces.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
   private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        SharedPreferences sharedPreferences = getSharedPreferences("aaa",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        binding.btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("bb",binding.etTest.getText().toString());
                editor.apply();
                binding.tvTest.setText(sharedPreferences.getString("bb"," 12345"));

            }
        });
        binding.tvTest.setText(sharedPreferences.getString("bb"," 12345"));

    }
}