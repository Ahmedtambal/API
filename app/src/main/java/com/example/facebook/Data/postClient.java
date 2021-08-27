package com.example.facebook.Data;

import com.example.facebook.dj.PostModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class postClient {

    private static final String Base_Url = ("https://jsonplaceholder.typicode.com/");

    private apiInterface postInterface ;

    private static postClient inst;

    public postClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Base_Url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        postInterface = retrofit.create(apiInterface.class);
    }

    public static postClient getInst() {

        if(null == inst){
            inst = new postClient();
        }
        return inst;
    }

    public Call<List<PostModel>> getPosts()
    {
        return postInterface.getPosts();
    }
}
