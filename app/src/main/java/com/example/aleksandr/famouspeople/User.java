package com.example.aleksandr.famouspeople;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Aleksandr on 3/28/2018.
 */
@Entity
public class User {

    public User(String firstname, String lastName, String email) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.email = email;
    }
    @PrimaryKey(autoGenerate = true)

    private int id;
    @ColumnInfo(name = "first_name")
    private String firstname;
    @ColumnInfo(name = "last_name")
    private String lastName;
    @ColumnInfo(name = "email")
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
}
