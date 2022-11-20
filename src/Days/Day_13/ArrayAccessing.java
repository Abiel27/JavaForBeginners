package Days.Day_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAccessing {
    public static void main(String[] args) {


    String[] arr = {"Abiel", "Rahwit", "Hosi","Aboy","Almi"};

        List<String > myList = new ArrayList<>(Arrays.asList(arr));
        System.out.println(myList);

        for (int i = 0; i < arr.length; i++ ){
            System.out.println(arr[i].substring(0,3));



        }



    }}
