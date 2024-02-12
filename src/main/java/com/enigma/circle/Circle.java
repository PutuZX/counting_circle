package com.enigma.circle;

public class Circle extends piValue{
    private int radius;

    Circle(double pi, int radius){
        super(pi);
        this.radius = radius;
    }

    public double getArea(){
        return super.getPI() * (radius*radius);
    }

    public double getRound(){
        return 2 * super.getPI() * radius;
    }
}

class piValue {
    private double pi;

    piValue(double pi){
        this.pi = pi;
    }

    public double getPI(){
        return pi;
    }
}
