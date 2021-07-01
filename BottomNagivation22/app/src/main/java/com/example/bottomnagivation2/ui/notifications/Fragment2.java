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
    Button mButtonSend;
    private static String KEY_NAME = "name";
    public static Fragment2 newInstance(String msg){
        Fragment2 fragment = new Fragment2();
        Bundle args = new Bundle();
        args.putString(KEY_NAME,msg);
        fragment.setArguments(args);
        return fragment;
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
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
                fragmentTransaction1.add(R.id.framLayout1,fragment1, null);
                fragmentTransaction1.addToBackStack("aaa");
                fragmentTransaction1.commit();
            }
        });
    }

    public void updateTextButton(String text) {
        mButtonSend.setText(text);
    }
}
