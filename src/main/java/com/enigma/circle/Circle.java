package com.enigma.circle;

public class Circle {
    private int radius;
    private double pi = 3.14;

    public void circle(int radius){
        this.radius = radius;
    }

    public double getArea(){
        return pi * (radius * radius);
    }

    public double getRound(){
        return 2 * pi * radius;
    }
}
