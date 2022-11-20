package Days.Day_5_StringManupulation;

import java.util.Arrays;
import java.util.TreeSet;

public class remoDuplAndSort {
    public static void main(String[] args) {
        Integer[] numbers= {1,2,3,4,5,1,12,3,34,4};
        numbers = new TreeSet<Integer>(Arrays.asList(numbers)).toArray(new Integer[3]);
        System.out.println(" = " +Arrays.toString(numbers));
    }
}

