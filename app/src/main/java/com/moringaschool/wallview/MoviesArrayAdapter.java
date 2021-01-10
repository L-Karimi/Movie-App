package com.moringaschool.wallview;

import android.content.Context;
import android.widget.ArrayAdapter;

public class MoviesArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mMovies;
    private String[] mGenres;

    public MoviesArrayAdapter(Context mContext, int resource, String[] mMovies, String[] mGenres) {

        super(mContext, resource);
        this.mContext = mContext;
        this.mMovies = mMovies;
        this.mGenres = mGenres;
    }
    @Override
    public Object getItem(int position) {
        String Movies = mMovies[position];
        String Genre = mGenres[position];
        return String.format("%s \nFavourite Movies: %s", mMovies, mGenres);
    }

    @Override
    public int getCount() {
        return mMovies.length;
    }

    }

