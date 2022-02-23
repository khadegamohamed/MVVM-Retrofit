package com.example.facebook2.ui.main;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.example.facebook2.databinding.ListItemPostsBinding;
import com.example.facebook2.pojo.PostsModel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AdepterofRecycler extends RecyclerView.Adapter<AdepterofRecycler.Viewholder> {
private ArrayList<PostsModel> arrayofposts= new ArrayList<>();

    public ArrayList<PostsModel> getArrayofposts() {
        return arrayofposts;
    }

    public void setArrayofposts(ArrayList<PostsModel> arrayofposts) {
        this.arrayofposts = arrayofposts;
    }

    public class Viewholder extends RecyclerView.ViewHolder{
     private ListItemPostsBinding binding;
     public Viewholder(ListItemPostsBinding binding){
         super(binding.getRoot());
         this.binding = binding;
     }
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Viewholder(ListItemPostsBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
PostsModel post = arrayofposts.get(position);
holder.binding.id.setText(post.getId()+"");
holder.binding.post.setText(post.getTitle());
holder.binding.post.setText(post.getBody());
    }

    @Override
    public int getItemCount() {
        return arrayofposts.size();
    }
}
