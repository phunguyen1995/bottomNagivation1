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
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.myviewmodel.databinding.ActivityFragment1Binding;
import com.example.myviewmodel.databinding.ActivityFragment2Binding;

public class Fragment1 extends Fragment {
    DataTestViewModel viewmodel;
    ActivityFragment1Binding binding;
    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       binding = ActivityFragment1Binding.inflate(inflater,container,false);
       viewmodel= new ViewModelProvider(requireActivity()).get(DataTestViewModel.class);
       viewmodel.textString.observe(requireActivity(), new Observer<String>() {
           @Override
           public void onChanged(String s) {
               binding.tvfragment1.setText(s);
           }
       });
        initComponents(binding.getRoot());
        return binding.getRoot();
    }
    private void initComponents(View view1){

        binding.btnfragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment2 fragment2 = new Fragment2();
                FragmentTransaction fragmentTransaction1 = getParentFragmentManager()
                        .beginTransaction();
                fragmentTransaction1.replace(R.id.framelayout,fragment2);
                fragmentTransaction1.addToBackStack("aaa");
                fragmentTransaction1.commit();

            }
        });
    }
}
