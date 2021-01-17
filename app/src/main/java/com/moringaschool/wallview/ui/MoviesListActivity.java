package com.moringaschool.wallview.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.moringaschool.wallview.MoviesArrayAdapter;
import com.moringaschool.wallview.R;
import com.moringaschool.wallview.adapters.MovieListAdapter;
import com.moringaschool.wallview.model.Result;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;



public class MoviesListActivity extends AppCompatActivity {

    @BindView(R.id.recyclerView) RecyclerView mRecyclerView;
    @BindView(R.id.errorTextView) TextView mErrorTextView;
    @BindView(R.id.progressBar) ProgressBar mProgressBar;
//    @BindView(R.id.genresTextView)
//    TextView mGenreTextView;
//    @BindView(R.id.FindMoviesButton)
//    Button AboutActivity;
    // string of movies
//    private String[] movies = new String[]{
//            "Insidious", "Equalizer",
//            "War Room", "Bay Watch", "Lucy", "Love and Lust",
//            "The mechanic resurrection", "Transporter"
//    };

    //
//    private String[] genres = new String[]{    private String[] movies = new String[]{
//            "Insidious", "Equalizer",
//            "War Room", "Bay Watch", "Lucy", "Love and Lust",
//            "The mechanic resurrection", "Transporter"
//    };
//
//    private String[] genres = new String[]{
//            "Fantasy", "War", "Romance",
//            "Action", "Horror", "Drama", "Comedy", "Thriller"
//    }
//            "Fantasy", "War", "Romance",
//            "Action", "Horror", "Drama", "Comedy", "Thriller"
//    };
//toast

    private MovieListAdapter mAdapter;
    public List<Result> results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        ButterKnife.bind(this);

        // Establishing connection to the Moviedb API

    }


}

