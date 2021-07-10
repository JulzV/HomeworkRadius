package com.companyntro;
import java.util.Scanner;
public class Main {



    public static void main(String[] args) {
// Assignment
// Write a Circle class, that takes in the radius as a field
// Create 2 constructors, one with the field as a parameter and one without.
// write methods find the circumference and area of the circle
//The radius should be taken from the user


        Scanner radius = new Scanner(System.in);
        System.out.println("Enter the radius of circle 1 here: ");
        String userRadius = radius.nextLine();

        Circle circle1 = new Circle();
        circle1.radius = Double.parseDouble(userRadius);

        Circle circle2 = new Circle(Double.parseDouble(userRadius));



//      Printing results
        circle1.calcCircumference();
        System.out.println("Circumference of Circle 1 = " + circle1.circumference);
        circle1.calcCircleArea();
        System.out.println("Circle area of Circle 1 = " + circle1.circleArea);

        circle2.calcCircumference();
        System.out.println("Circumference of Circle 2 = " + circle2.circumference);
        circle2.calcCircleArea();
        System.out.println("Circle area of Circle 2 = " + circle2.circleArea);
    }
}
