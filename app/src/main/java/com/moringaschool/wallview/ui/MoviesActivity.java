package com.moringaschool.wallview.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.moringaschool.wallview.MoviesArrayAdapter;
import com.moringaschool.wallview.R;

import butterknife.BindView;
import butterknife.ButterKnife;



public class MoviesActivity extends AppCompatActivity {

    @BindView(R.id.recyclerView)
    RecyclerView mRecyclerView;
    @BindView(R.id.errorTextView)
    TextView mErrorTextView;
    @BindView(R.id.progressBar)
    ProgressBar mProgressBar;
//    @BindView(R.id.genresTextView)
//    TextView mGenreTextView;
    @BindView(R.id.FindMoviesButton)
    Button AboutActivity;
    // string of movies
    private String[] movies = new String[]{
            "Insidious", "Equalizer",
            "War Room", "Bay Watch", "Lucy", "Love and Lust",
            "The mechanic resurrection", "Transporter"
    };

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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        ButterKnife.bind(this);
        MoviesArrayAdapter adapter = new MoviesArrayAdapter(this, android.R.layout.simple_list_item_1, movies);
        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String movies = ((TextView) view).getText().toString();
                Toast.makeText(MoviesActivity.this, movies, Toast.LENGTH_LONG).show();
            }
        });

//appearance of the list of variables
        Intent intent = getIntent();
        String genres = intent.getStringExtra("genres");
        mGenreTextView.setText("Available genres: " + genres);

//        AboutActivity.setOnClickListener(new View.OnClickListener() {

        //intent to move to next activities
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MoviesActivity.this, com.moringaschool.wallview.ui.AboutActivity.class);
//                startActivity(intent);
//            }
//        });
    }
}
