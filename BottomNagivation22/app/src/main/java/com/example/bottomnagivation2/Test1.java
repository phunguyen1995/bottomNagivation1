package com.example.bottomnagivation2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.bottomnagivation2.R;
import com.example.bottomnagivation2.databinding.Activity2Binding;
import com.example.bottomnagivation2.ui.notifications.Fragment2;
import com.example.bottomnagivation2.ui.notifications.OnSendMessageListener;

public class Test1 extends AppCompatActivity implements OnSendMessageListener {
    Activity2Binding binding;
    Fragment2 fragment2;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        binding = Activity2Binding.inflate(getLayoutInflater());
        binding.btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment2 = Fragment2.newInstance("aaaa");
                FragmentTransaction fragmentTransaction2 = getSupportFragmentManager()
                        .beginTransaction();

                fragmentTransaction2.add(R.id.framLayout1,fragment2, null);
                fragmentTransaction2.addToBackStack("bbb");
                fragmentTransaction2.commit();
            }
        });
    }

    @Override
    public void onSend(String msg) {
        fragment2.updateTextButton(msg);
    }
}
