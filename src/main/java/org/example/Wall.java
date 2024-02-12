package org.example;

public class Wall extends Barrier{


    public Wall(int height) {
        this.height = height;
    }

    private int height;

    public int getHeight() {
        return height;
    }
}
