package com.binarygeek.onlylayoutsone;

public class ItemsDetails {
    private String hotel_name;
    private String hotel_plase;
    private String hotel_cost;
    private String hotel_rating;
    private int img;

    public ItemsDetails() {
    }

    public ItemsDetails(String hotel_name, String hotel_plase, String hotel_cost, String hotel_rating, int img) {
        this.hotel_name = hotel_name;
        this.hotel_plase = hotel_plase;
        this.hotel_cost = hotel_cost;
        this.hotel_rating = hotel_rating;
        this.img = img;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public String getHotel_plase() {
        return hotel_plase;
    }

    public void setHotel_plase(String hotel_plase) {
        this.hotel_plase = hotel_plase;
    }

    public String getHotel_cost() {
        return hotel_cost;
    }

    public void setHotel_cost(String hotel_cost) {
        this.hotel_cost = hotel_cost;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getHotel_rating() {
        return hotel_rating;
    }

    public void setHotel_rating(String hotel_rating) {
        this.hotel_rating = hotel_rating;
    }
}
