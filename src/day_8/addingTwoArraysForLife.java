package day_8;

import myUtilMethods.combineTwoArrays;

import java.util.Arrays;

public class addingTwoArraysForLife {
    public static void main(String[] args) {
        int[] hosi = {2,5,4,6,7};
        int[] almi = {8,9,0,10};

       int[] tekish =combineTwoArrays.combineTwoArrays(hosi,almi);
        System.out.println(" = " + Arrays.toString(tekish));


    }
}
