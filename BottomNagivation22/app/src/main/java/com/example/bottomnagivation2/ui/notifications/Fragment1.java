package com.example.bottomnagivation2.ui.notifications;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.bottomnagivation2.R;
import com.example.bottomnagivation2.Test1;

import org.jetbrains.annotations.NotNull;

public class Fragment1 extends Fragment {
    private TextView tvFragment1;
    private Button btnUpdate;
    private OnSendMessageListener listener;

    @Override
    public void onAttach(@NonNull @NotNull Context context) {
        super.onAttach(context);
        if (context instanceof Test1) {
            listener = (Test1)context;
        }
    }


    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View view1 = inflater.inflate(R.layout.fragment3,container,false);
        tvFragment1 = view1.findViewById(R.id.tvFragmet1);
        btnUpdate = view1.findViewById(R.id.btnUpdate);
        btnUpdate.setOnClickListener((v) -> {
            listener.onSend("Phu1");
            getActivity().onBackPressed();
        });
        return view1;
    }
}
