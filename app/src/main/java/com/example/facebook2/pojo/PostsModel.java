package com.example.facebook2.pojo;

public class PostsModel {

   private  int userId;
   private int id;
   private String title;
   private String body;

    public PostsModel(int userId,int id,String title,String boby) {
        this.userId = userId;
        this.id  =id;
        this.title = title;
        this.body = boby;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}

