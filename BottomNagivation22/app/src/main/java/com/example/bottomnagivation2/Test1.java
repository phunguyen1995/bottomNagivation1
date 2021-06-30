package com.example.bottomnagivation2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.bottomnagivation2.R;
import com.example.bottomnagivation2.ui.notifications.Fragment2;

public class Test1 extends AppCompatActivity {

    Button btnTest1;
    FrameLayout frameLayout1;
    String a;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        btnTest1 = findViewById(R.id.btn1);
        frameLayout1 = findViewById(R.id.framLayout1);
        btnTest1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment2 fragment2 = new Fragment2();
                FragmentTransaction fragmentTransaction2 = getSupportFragmentManager()
                        .beginTransaction();
                fragmentTransaction2.replace(R.id.framLayout1,fragment2);
                fragmentTransaction2.addToBackStack(a);
                fragmentTransaction2.commit();
            }
        });
    }
}
