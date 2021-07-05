package com.example.myviewmodel;

import androidx.databinding.BaseObservable;

public class Account extends BaseObservable {
    public String name, age;

    public Account(String name, String age) {
        this.name = name;
        this.age = age;
    }
}
