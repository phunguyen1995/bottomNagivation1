package com.example.myactivitydatabase1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myactivitydatabase1.databinding.ActivityDetailBinding;
import com.example.myactivitydatabase1.databinding.ActivityInsertBinding;

class DetailSV extends AppCompatActivity {
    private ActivityDetailBinding binding2;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding2 = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding2.getRoot());
        Useritem a = (Useritem) getIntent().getSerializableExtra("data");
        binding2.tvlop.setText(a.lop);
        binding2.tvDateDetail.setText(a.ngaythem);
        binding2.tvTeacherDetail.setText(a.giaovien);
        binding2.tvAgeDetail.setText(a.age);
        binding2.tvNameDetail.setText(a.name);
        binding2.tvAdressDetail.setText(a.adress);
        binding2.btnBackDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }}
