package com.example.facebook2.ui.main;

import static android.content.ContentValues.TAG;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.facebook2.data.PostsClient;
import com.example.facebook2.pojo.PostsModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PostsViewModel extends ViewModel {
    MutableLiveData<ArrayList<PostsModel>>  mutableLiveData = new MutableLiveData<>();
    public void getposts( ){
      PostsClient.getInstance().getposts().enqueue(new Callback<ArrayList<PostsModel>>() {
          @Override
          public void onResponse(Call<ArrayList<PostsModel>> call, Response<ArrayList<PostsModel>> response) {
              mutableLiveData.setValue(response.body());
          }

          @Override
          public void onFailure(Call<ArrayList<PostsModel>> call, Throwable t) {
              Log.d(TAG, "onFailure: ");
          }
      });
    }
}
