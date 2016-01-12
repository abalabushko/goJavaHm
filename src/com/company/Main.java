package com.company;

import com.company.HM4.Square;
import com.company.HM4.Temperature;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.printf("triangle S = %.2f; " , Square.triangleSquare(14, 12, 12));
        System.out.printf("circle S = %.2f; " , Square.circleSquare(3));
        System.out.printf("rectangle S = %.2f; ", Square.rectangleSquare(3 , 6));
        System.out.printf("F =  %.2f ", Temperature.fromCelsiusToFahrenheit(3));
        System.out.printf("C =  %.2f ", Temperature.fromFahrenheitToCelsius(-6));

    }

}
