package com.company;

import com.company.HM4.Square;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.printf("triangle S = %.2f; " , Square.triangleSquare(14, 12, 12));
        System.out.printf("circle S = %.2f; " , Square.circleSquare(3));
        System.out.printf("rectangle S = %.2f; ", Square.rectangleSquare(3 , 6));

    }

}
