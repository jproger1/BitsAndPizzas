package com.jproger.bitsandpizzas;

public class Pizza {
    private String name;
    private int ImageResourceId;

    public static final Pizza[] pizzas = {
            new Pizza("Diavolo", R.drawable.diavolo),
            new Pizza("Funghi", R.drawable.funghi)
    };

    public Pizza(String name, int imageResourceId) {
        this.name = name;
        ImageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return ImageResourceId;
    }
}
