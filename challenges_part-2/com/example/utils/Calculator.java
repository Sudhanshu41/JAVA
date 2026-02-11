package com.example.utils;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle();
        int r;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        r = input.nextInt();
        cir.setRadius(r);
        System.out.println("Area is: "+cir.getArea());
        Rectangle rec = new Rectangle();
        int l,b;
        System.out.println("Enter the length of the rectangle: ");
        l= input.nextInt();
        System.out.println("Enter the breadth of the rectangle: ");
        b= input.nextInt();
        rec.setLength(l);
        rec.setBreadth(b);
        System.out.println("Area is: "+rec.getArea());
    }
}
