package com.samsung.hakaton2024.ui.search;

public class ItemRecycler {

    String background;
    int image;

    public ItemRecycler(String background, int image) {
        this.background = background;
        this.image = image;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
