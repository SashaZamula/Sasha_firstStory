package com.example.aleksandr.famouspeople;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    FloatingActionButton fab;
//    ArrayList<User> users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        Toolbar toolbar = (Toolbar) findViewById( R.id.toolbar );
        setSupportActionBar( toolbar );

        recyclerView = findViewById( R.id.recycler_view );

        AppDatabase db = Room.databaseBuilder( getApplicationContext(), AppDatabase.class, "production" )
                .allowMainThreadQueries()
                .build();

        List<User> users = db.userDao().getAllUsers();

        recyclerView.setLayoutManager( new LinearLayoutManager( this ) );
        adapter = new UserAdapter( users );
        recyclerView.setAdapter( adapter );

        fab = findViewById( R.id.fab );
        fab.setOnClickListener( (View v) -> {
            Log.d( TAG, "onClick: pressed!" );

            startActivity( new Intent( MainActivity.this, CreateUser.class ) );
        } );

    }
}
