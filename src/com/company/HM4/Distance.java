package com.company.HM4;

/**
 * Created by pc on 12.01.16.
 */
public class Distance {

    public static double getDistance(int x1, int y1, int x2, int y2) {
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }
}
