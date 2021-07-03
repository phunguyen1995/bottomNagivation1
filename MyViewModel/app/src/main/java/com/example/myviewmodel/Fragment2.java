package com.example.myviewmodel;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myviewmodel.databinding.ActivityFragment1Binding;
import com.example.myviewmodel.databinding.ActivityFragment2Binding;

public class Fragment2 extends Fragment {
    private  DataTestViewModel ViewModel;
    private ActivityFragment2Binding binding;
    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        binding = ActivityFragment2Binding.inflate(inflater,container,false);
        ViewModel = new ViewModelProvider(requireActivity()).get(DataTestViewModel.class);
        binding.tvfragment2.setText(" Fragment 2");
        binding.btnfragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewModel.textString.setValue("phu");
                getActivity().onBackPressed();
            }
        });
        return binding.getRoot();
    }
}
