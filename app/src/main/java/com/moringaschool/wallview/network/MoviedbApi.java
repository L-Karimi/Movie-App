package com.moringaschool.wallview.network;

import com.moringaschool.wallview.model.Movie;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MoviedbApi {
    @GET("search/movie")
    Call<Movie> getMovie(
            @Query("api_key") String api_key,
            @Query("query") String query,
              @Query("page") String page
    );
}
