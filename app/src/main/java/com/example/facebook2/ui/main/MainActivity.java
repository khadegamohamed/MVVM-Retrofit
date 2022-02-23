package com.example.facebook2.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.facebook2.R;
import com.example.facebook2.databinding.ActivityMainBinding;
import com.example.facebook2.pojo.PostsModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
PostsViewModel postsViewModel;
ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding = ActivityMainBinding.inflate(getLayoutInflater());
       View vbinding = binding.getRoot();
       setContentView(vbinding);
       AdepterofRecycler adepter = new AdepterofRecycler();
       binding.recylerview.setAdapter(adepter);

        postsViewModel = new ViewModelProvider(this).get(PostsViewModel.class);
        postsViewModel.mutableLiveData.observe(this, new Observer<ArrayList<PostsModel>>() {
            @Override
            public void onChanged(ArrayList<PostsModel> postsModels) {
                adepter.setArrayofposts(postsModels);
            }
        });

postsViewModel.getposts();
        RecyclerView.LayoutManager rm = new LinearLayoutManager(this);
        binding.recylerview.setLayoutManager(rm);
        binding.recylerview.setHasFixedSize(true);
    }
}