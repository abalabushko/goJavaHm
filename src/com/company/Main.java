package com.company;

import com.company.HM4.Distance;
import com.company.HM4.Square;
import com.company.HM4.Temperature;
import com.company.HM5.Array;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] array = new int[]{1, 3, 5, 2, 7, 5, 9, 0, 13, 17};

        int maxElement = Array.getMaxElement(array);
        System.out.println(" максимальный элемент " + maxElement);
        int minElement = Array.getMinElement(array);
        System.out.println(" минимальный элемент " + minElement);

        System.out.printf("triangle S = %.2f; " , Square.triangleSquare(14, 12, 12));
        System.out.printf("circle S = %.2f; " , Square.circleSquare(3));
        System.out.printf("rectangle S = %.2f; ", Square.rectangleSquare(3 , 6));
        System.out.printf("F =  %.2f ", Temperature.fromCelsiusToFahrenheit(3));
        System.out.printf("C =  %.2f ", Temperature.fromFahrenheitToCelsius(-6));
        System.out.printf("distance  %.2f", Distance.getDistance(1, 3, 7, 4));

    }

}
