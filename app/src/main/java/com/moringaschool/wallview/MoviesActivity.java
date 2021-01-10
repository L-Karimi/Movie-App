package com.moringaschool.wallview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MoviesActivity extends AppCompatActivity {
    @BindView(R.id.locationEdit)
    TextView mLocationTextView;
    @BindView(R.id.listView)
    ListView mListView;

    private String[] movies = new String[] {"Insidious", "Equalizer",
            "War Room", "Bay Watch", "Lucy", "Love and Lust",
            "The mechanic resurrection", "Transporter", "Soul", "Avengers",
            "Shirley", "Wonder Woman", "Roma",
            "Get Out", "Moonlight"};
    private String[] genres = new String[] {"Fantasy", "WAr", "Romance",
            "Action", "Horror", "Drama", "Comedy", "Thriller",  };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        ButterKnife.bind(this);

        MoviesArrayAdapter adapter = new MoviesArrayAdapter(this, android.R.layout.simple_list_item_1, movies, genres);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener((adapterView, view, i, l) -> {
            String movies = ((TextView)view).getText().toString();
            Toast.makeText(MoviesActivity.this, movies, Toast.LENGTH_LONG).show();
        });

        Intent intent = getIntent();
        String location = intent.getStringExtra("location");

        mLocationTextView.setText("Here are all the movies available : " );
    }
}