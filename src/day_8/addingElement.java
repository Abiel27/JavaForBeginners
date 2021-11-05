package day_8;

import java.util.Arrays;

public class addingElement {
    public static void main(String[] args) {
        int[] xxx = {1,3,4,5,6};


//        System.out.println("xxx = " + Arrays.toString(addElement(xxx,4)));

        System.out.println("--------------option 2-----------------");

       int[] meakor =addElement(xxx,200000000);
        System.out.println("meakor = " + Arrays.toString(meakor));


//        System.out.println("Arrays.toString(xxx) = " + Arrays.toString(xxx));
//


    }
//    add an element to the existing array and return a new araray.

    public static int[] addElement(int[] array, int num){
        int[] result = new int[array.length+1];

        for(int i = 0; i<= array.length-1; i++ ){
            result[i]  = array[i];
        }

        result[result.length-1] = num;

        return result;
    }

}
