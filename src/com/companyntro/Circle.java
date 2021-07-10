package com.companyntro;

public class Circle {

    double radius;
    double circumference;
    double circleArea;
    double pi = 3.14;


// A.   Constructor with parameters
    public Circle(double radius) {
        this.radius = radius;
    }

// B.   Constructor without parameters
    public Circle() {
        this.radius = radius;
    }

// Circumference formula c = 2 * PI * radius
      void calcCircumference() {
       circumference = 2 * pi * radius;
       }

// Circle area formula S = PI * radius^2
   void calcCircleArea (){
       circleArea = pi * Math.pow(radius, 2);
   }
}