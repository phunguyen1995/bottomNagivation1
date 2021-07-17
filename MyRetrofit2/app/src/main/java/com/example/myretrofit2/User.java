package com.example.myretrofit2;

import java.io.Serializable;

public class User implements Serializable {
    int mId;
    String mName;
    public User(int id, String name ) {
        this.mId = id;
        this.mName = name;
    }
}
