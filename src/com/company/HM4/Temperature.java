package com.company.HM4;

/**
 * Created by pc on 12.01.16.
 */
public class Temperature {

    public static double fromCelsiusToFahrenheit(double a){
        double f = 9*(a+32)/5;

        return f;
    }

    public static double fromFahrenheitToCelsius(double a) {
        double c = 5 * (a - 32) / 9;

        return c;
    }
}
