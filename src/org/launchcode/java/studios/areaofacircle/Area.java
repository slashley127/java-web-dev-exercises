package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius: ");
        double radius = input.nextDouble();
        double areaOfCircle = Circle.getArea(radius);
        System.out.println("The area of a circle with radius " + radius + " is " + areaOfCircle);
        input.close();
    }
}
