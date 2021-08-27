package com.example.facebook.Data;

import com.example.facebook.dj.PostModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface apiInterface {

    @GET("Posts")

    public Call<List<PostModel>> getPosts();
}
