package com.company.HM4;

/**
 * Created by pc on 12.01.16.
 */
public class Square {

    public static double triangleSquare(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static double circleSquare(double radius) {
        double s = Math.PI * (radius * radius);
        return s;
    }
    public static double rectangleSquare(double a,double b) {
        double s = a * b;
        return s;

    }
}
