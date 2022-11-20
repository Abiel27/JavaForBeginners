package Days.Day_11;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class removeDupsFromListOfArray {
    public static void main(String[] args) {
        //given object of Intiger Array,
        Integer[] arr = {1,1,3,4,5,3,2,1,1,5};
        //remove the duplicates and convert it to array

//       arr = new TreeSet<Integer>(Arrays.asList(arr)).toArray(new Integer[0]);
//        System.out.println(Arrays.toString(arr));

        arr = new LinkedHashSet<Integer>(Arrays.asList(arr)).toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));



    }
}
