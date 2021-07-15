package com.example.myactivitydatabase1;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;



import java.util.List;

@Dao
public interface UserDao {
    @Query("SELECT * FROM user")
    List<Useritem> getAll();

    @Query("SELECT * FROM user WHERE id IN (:userIds)")
    default List<User> loadAllByIds(int[] userIds) {
        return null;
    }

    // @Query("SELECT * FROM user WHERE firstName LIKE :first AND " +
    //      "lastName LIKE :last LIMIT 1")
    //User findByName(String first, String last);


    @Insert
    void insertAll(User... users);
    @Delete
    void delete(User user);
}
