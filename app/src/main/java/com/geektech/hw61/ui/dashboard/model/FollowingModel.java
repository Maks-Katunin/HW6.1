package com.geektech.hw61.ui.dashboard.model;

public class FollowingModel {
    private int image1View1, image2View2;
    private String text1View1;

    public FollowingModel(int image1View1, int image2View2, String text1View1) {
        this.image1View1 = image1View1;
        this.image2View2 = image2View2;
        this.text1View1 = text1View1;
    }

    public int getImage1View1() {
        return image1View1;
    }

    public int getImage2View2() {
        return image2View2;
    }

    public String getText1View1() {
        return text1View1;
    }
}
