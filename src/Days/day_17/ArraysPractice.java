package Days.day_17;

import java.util.*;

public class ArraysPractice {
    public static void main(String[] args) {

        int[] arr3 = new int[3];
        arr3[0] = 34;
        arr3[1] = 123;
        arr3[2] = 4545;
        System.out.println("arr3 = " + Arrays.toString(arr3));

        //=================

        Integer[] arr2= {34, 123, 4545,56,234,1,2,34,3};
        List<Integer> list = new ArrayList(Arrays.asList(arr2));
        System.out.println("list = " + Arrays.toString(arr2));

        Iterator<Integer> it = list.iterator();

            String myNum= "";
        while (it.hasNext()){
            Integer each = it.next();
            myNum += each;



        }



    }

}
