package com.example.bottomnagivation2.ui.notifications;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.bottomnagivation2.R;
import com.example.bottomnagivation2.Test1;

import org.jetbrains.annotations.NotNull;

public class Fragment2 extends Fragment {
    String a;
    Button mButtonSend;
    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
   View rootView = inflater.inflate(R.layout.fragment2,container,false);
   initComponents(rootView);
   return rootView;
    }
    private void initComponents(View rootView){
        mButtonSend= rootView.findViewById(R.id.btnfragmet2);
        mButtonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment1 fragment1 = new Fragment1();
                FragmentTransaction fragmentTransaction1 = getParentFragmentManager()
                        .beginTransaction();
                fragmentTransaction1.replace(R.id.framLayout1,fragment1);

                fragmentTransaction1.commit();
            }
        });
    }
}
