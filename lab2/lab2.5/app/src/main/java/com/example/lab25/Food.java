package com.example.lab25;

public class Food {
    private String Name;
    private int Thumbnail;
    private boolean isPromotion;

    public Food() {
    }

    public Food(String name, int thumbnail, boolean isPromotion) {
        Name = name;
        Thumbnail = thumbnail;
        this.isPromotion = isPromotion;
    }

    public Food(String name, int thumbnail) {
        Name = name;
        Thumbnail = thumbnail;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }

    public boolean isPromotion() {
        return isPromotion;
    }

    public void setPromotion(boolean promotion) {
        isPromotion = promotion;
    }
}