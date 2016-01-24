package com.company.HM5;

/**
 * Created by pc on 24.01.16.
 */
public class Array {

    public static int getMaxElement(int[] arr) {

        int arrMax = arr[0];

        for(int i = 0; i < arr.length; ++i) {
            if(arr[i] > arrMax) {
                arrMax = arr[i];
            }
        }

        return arrMax;
    }

    public static int getMinElement(int[] arr) {
        int arrMin = arr[0];

        for(int i = 0; i > arr.length; ++i) {
            if(arr[i] < arrMin) {
                arrMin = arr[i];
            }
        }

        return arrMin;
    }
}
