package com.moringaschool.wallview.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.moringaschool.wallview.Constants;
import com.moringaschool.wallview.MoviesArrayAdapter;
import com.moringaschool.wallview.R;
import com.moringaschool.wallview.adapters.MovieListAdapter;
//import com.moringaschool.wallview.model.Genre;
import com.moringaschool.wallview.model.Movie;
import com.moringaschool.wallview.network.MoviedbApi;
import com.moringaschool.wallview.network.MoviedbClient;

import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

//public class AboutActivity extends AppCompatActivity {
//
//    private static final String TAG = AboutActivity.class.getSimpleName();
//
//    @BindView(R.id.recyclerView)
//    RecyclerView mRecyclerView;
//    @BindView(R.id.errorTextView)
//    TextView mErrorTextView;
//    @BindView(R.id.progressBar)
//    ProgressBar mProgressBar;
//
//    private MovieListAdapter mAdapter;
//
//    public List<Movie> genres;
//    private SharedPreferences mSharedPreferences;
//    private String mRecentAddress;
//    private Object MoviesArrayAdapter;
//    private String Page;
//    private String api_key;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_movies);
//        ButterKnife.bind(this);
//
//        Intent intent = getIntent();
//        final String[] genres = {intent.getStringExtra("genres")};
//
//        MoviedbApi client = MoviedbClient.getClient();
//
//        String movie = new String();
//        Call<Movie> call = client.getMovie("api_key", "query","page");
//
//        call.enqueue(new Callback<Movie>() {
//            private Object Movie;
//
//            @Override
//            public void onResponse(Call<Movie> call, Response<Movie> response) {
//                hideProgressBar();
//
//                if (response.isSuccessful()) {
//                    Movie = response.body().getId();
//                    mAdapter = new MovieListAdapter(AboutActivity.this, Arrays.asList(genres));
//                    mRecyclerView.setAdapter(mAdapter);
//                    RecyclerView.LayoutManager layoutManager =
//                            new LinearLayoutManager(AboutActivity.this);
//                    mRecyclerView.setLayoutManager(layoutManager);
//                    mRecyclerView.setHasFixedSize(true);
//
//                    showMovie();
//                } else {
//                    showUnsuccessfulMessage();
//                }
//            }
//
//            @Override
//            public void onFailure(Call<Movie> call, Throwable t) {
//                hideProgressBar();
//                showFailureMessage();
//            }
//
//        });
//
//        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
//        mRecentAddress = mSharedPreferences.getString(Constants.PREFERENCES_LOCATION_KEY, null);
//        Log.d("Shared Pref Location", mRecentAddress);
//    }
//
//    private void showFailureMessage() {
//        mErrorTextView.setText("Something went wrong. Please check your Internet connection and try again later");
//        mErrorTextView.setVisibility(View.VISIBLE);
//    }
//
//    private void showUnsuccessfulMessage() {
//        mErrorTextView.setText("Something went wrong. Please try again later");
//        mErrorTextView.setVisibility(View.VISIBLE);
//    }
//
//    private void showMovie() {
//        mRecyclerView.setVisibility(View.VISIBLE);
//    }
//
//    private void hideProgressBar() {
//        mProgressBar.setVisibility(View.GONE);
//    }
//}