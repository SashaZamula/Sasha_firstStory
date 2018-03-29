package com.example.aleksandr.famouspeople;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;
@Dao
public interface UserDao {
    @Query( "SELECT * FROM user" )
    List<User> getAllUsers();

    @Insert
    void insertAll(User... users);

  }
