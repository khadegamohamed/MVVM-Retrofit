package com.example.facebook2.data;

import com.example.facebook2.pojo.PostsModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostsInterface {
    @GET("posts")
    public Call<ArrayList<PostsModel>> getposts();
}
