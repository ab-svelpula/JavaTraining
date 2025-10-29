package com.assignment.Oct27;

/*Write a Java program to find the perimeter of a rectangle.
(Formula: 2 × (length + width))*/

public class RectanglePerimeter {
    public static void main(String[] args) {
        double length = 10.0;
        double width = 5.0;

        double perimeter = 2 * (length + width);

        System.out.println("Length of the rectangle: " + length);
        System.out.println("Width of the rectangle: " + width);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
