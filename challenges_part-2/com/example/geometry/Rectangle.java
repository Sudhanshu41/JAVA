package com.example.geometry;

public class Rectangle {
    private int length,breadth;
    private long area;

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public long getArea() {
        return length*breadth;
    }
}
