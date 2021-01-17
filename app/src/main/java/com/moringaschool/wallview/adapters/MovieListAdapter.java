package com.moringaschool.wallview.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.moringaschool.wallview.R;
import com.moringaschool.wallview.model.Movie;
import com.moringaschool.wallview.ui.MovieDetailActivity;
import com.squareup.picasso.Picasso;

import org.parceler.Parcels;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.MovieViewHolder> {
    private List<Movie> mGenres;
    private Context mContext;

    public MovieListAdapter(Context context, List genres) {
        mContext = context;
        mGenres = genres;
    }

    public void bindGenres(Movie genres) {
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(MovieListAdapter.MovieViewHolder holder, int position) {
        holder.bindGenres(mGenres.get(position));
    }

    @Override
    public int getItemCount() {
        return mGenres.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @BindView(R.id.movieImageView)
        ImageView mMovieImageView;
        @BindView(R.id.genresTextView)
        TextView mNameTextView;
        @BindView(R.id.categoryTextView) TextView mCategoryTextView;
        @BindView(R.id.ratingTextView) TextView mRatingTextView;
        private Context mContext;

        public MovieViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();

        }

        public void bindGenres(Movie genres) {
            mNameTextView.setText(genres.getTitle());
            mCategoryTextView.setText(genres.getGenres().get(0).getId());
            mRatingTextView.setText("Rating: " + genres.getPopularity() + "/5");
            Picasso.get().load(genres.getPosterPath()).into(mMovieImageView);
        }

        @Override
        public void onClick(View v) {
            int itemPosition = getLayoutPosition();
            Intent intent = new Intent(mContext, MovieDetailActivity.class);
            intent.putExtra("position", itemPosition);
            intent.putExtra("movie", Parcels.wrap(mGenres));
            mContext.startActivity(intent);
        }
    }

}


