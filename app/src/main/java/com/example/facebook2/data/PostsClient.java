package com.example.facebook2.data;
import com.example.facebook2.pojo.PostsModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PostsClient {
    private static final String baseurl="https://jsonplaceholder.typicode.com/";
private static  PostsClient postsClientinstans;
private PostsInterface postsInterface;

    public PostsClient() {
Retrofit retrofit = new Retrofit.Builder().baseUrl(baseurl)
        .addConverterFactory(GsonConverterFactory.create())
        .build();
postsInterface  = retrofit.create(PostsInterface.class);
    }
public static PostsClient getInstance(){
        if(postsClientinstans == null){
            postsClientinstans =new  PostsClient();
        }
        return postsClientinstans;
}
public Call<ArrayList<PostsModel>>getposts(){
        return postsInterface.getposts();
}

}
