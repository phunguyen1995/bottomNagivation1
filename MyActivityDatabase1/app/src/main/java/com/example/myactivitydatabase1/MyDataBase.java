package com.example.myactivitydatabase1;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;



@Database(entities = {User.class}, version = 1000)
public abstract class MyDataBase extends RoomDatabase {
    public abstract UserDao userDao();

    public static  MyDataBase instanceDatabase(Context context) {
        return Room.databaseBuilder(context,
                MyDataBase.class, "myDatabase").allowMainThreadQueries().build();
    }
}
