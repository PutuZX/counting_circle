package com.enigma.circle;

/**
 * Hello world!
 *
 */

import java.util.Scanner;

public class App extends Circle
{
    public static void main( String[] args )
    {
        App circle = new App();
        Scanner input = new Scanner(System.in);
        System.out.print("Input the radius: ");
        int radius = input.nextInt();
        circle.circle(radius);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Round: " + circle.getRound());
    }
}
