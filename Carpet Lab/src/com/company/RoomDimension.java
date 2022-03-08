package com.company;

public class RoomDimension {

    // Name will remain constant.
    private int width;

    // The salary can change.
    private int length;

    // Initializing variables
    public RoomDimension (int w, int l) {
        width = w;
        length = l;
    }

    public int area () {
        return width * length;
    }
}
