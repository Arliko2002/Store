package com.example.store.models;;
import com.fasterxml.jackson.annotation.*;

public class Product {

    private String id,userId,title,body;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

//    private long id;
//    private String title;
//    private double price;
//    private String description;
//    private Category category;
//    private String image;
//    private Rating rating;
//
//    @JsonProperty("id")
//    public long getID() {
//        return id;
//    }
//
//    @JsonProperty("id")
//    public void setID(long value) {
//        this.id = value;
//    }
//
//    @JsonProperty("title")
//    public String getTitle() {
//        return title;
//    }
//
//    @JsonProperty("title")
//    public void setTitle(String value) {
//        this.title = value;
//    }
//
//    @JsonProperty("price")
//    public double getPrice() {
//        return price;
//    }
//
//    @JsonProperty("price")
//    public void setPrice(double value) {
//        this.price = value;
//    }
//
//    @JsonProperty("description")
//    public String getDescription() {
//        return description;
//    }
//
//    @JsonProperty("description")
//    public void setDescription(String value) {
//        this.description = value;
//    }
//
//    @JsonProperty("category")
//    public Category getCategory() {
//        return category;
//    }
//
//    @JsonProperty("category")
//    public void setCategory(Category value) {
//        this.category = value;
//    }
//
//    @JsonProperty("image")
//    public String getImage() {
//        return image;
//    }
//
//    @JsonProperty("image")
//    public void setImage(String value) {
//        this.image = value;
//    }
//
//    @JsonProperty("rating")
//    public Rating getRating() {
//        return rating;
//    }
//
//    @JsonProperty("rating")
//    public void setRating(Rating value) {
//        this.rating = value;
//    }
//}
//