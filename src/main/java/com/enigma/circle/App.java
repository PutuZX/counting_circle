package com.enigma.circle;

/**
 * Hello world!
 *
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Input the radius: ");
        int radius = input.nextInt();
        Circle c = new Circle(pi, radius);
        System.out.println("Area: " + c.getArea());
        System.out.println("Round: " + c.getRound());
    }
}
