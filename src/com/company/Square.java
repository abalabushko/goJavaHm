package com.company;

/**
 * Created by pc on 12.01.16.
 */
public class Square {

    public static double triangleSquare(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
