package com.example.aleksandr.famouspeople;

import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomDatabase;
import android.support.annotation.NonNull;

@Database( entities = {User.class}, version = 2)
public abstract class AppDatabase extends RoomDatabase {

public abstract UserDao userDao();

}
