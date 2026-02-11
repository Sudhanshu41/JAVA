package com.example.geometry;

import java.util.Scanner;

public class Circle {
      private int radius;
      private double area;

    public double getArea() {
        return Math.pow(radius,2)*Math.PI;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
