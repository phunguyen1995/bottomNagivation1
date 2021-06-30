package com.example.bottomnagivation2.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.bottomnagivation2.R;

import org.jetbrains.annotations.NotNull;

public class Fragment1 extends Fragment {
    TextView tvFragment1;
    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View view1 = inflater.inflate(R.layout.fragment3,container,false);
        tvFragment1 = view1.findViewById(R.id.tvFragmet1);
        return view1;
    }
}
