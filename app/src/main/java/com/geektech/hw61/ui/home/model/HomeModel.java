package com.geektech.hw61.ui.home.model;

public class HomeModel {

    private String desc, data;
    private int image;

    public HomeModel(String desc, String data, int image) {
        this.desc = desc;
        this.data = data;
        this.image = image;
    }

    public String getDesc() {
        return desc;
    }

    public String getData() {
        return data;
    }

    public int getImage() {
        return image;
    }
}
