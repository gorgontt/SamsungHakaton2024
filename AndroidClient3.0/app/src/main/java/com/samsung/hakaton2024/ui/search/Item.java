package com.samsung.hakaton2024.ui.search;

public class Item {
    String genre;
    int img;

    public Item(String genre, int img) {
        this.genre = genre;
        this.img = img;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
