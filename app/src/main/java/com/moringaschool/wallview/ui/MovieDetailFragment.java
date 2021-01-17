package com.moringaschool.wallview.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.moringaschool.wallview.R;
import com.moringaschool.wallview.model.Movie;
import com.moringaschool.wallview.model.Result;

public class MovieDetailFragment extends AppCompatActivity {

    public static Fragment newInstance(Result genres) {
        return null;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail_fragment);
    }
}