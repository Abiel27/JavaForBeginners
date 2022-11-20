package Days.day_10;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class collectiontoTreesetToarrays {
    public static void main(String[] args) {
        //Given intiger array
        Integer [] myArray = {1,4,5,12,43,2,5,};
        int length = myArray.length;
        System.out.println("myArray = " + length);
        //Convert the collection in to set > TreeSet
        Set<Integer> mySet =  new TreeSet<>();
        //Then convert to Array as List
        mySet.addAll(Arrays.asList(myArray));
        System.out.println("mySet = " + mySet);
        //then convert it to Array,
        myArray = mySet.toArray(new Integer[0]);
        boolean remove = mySet.remove(43);
        System.out.println("remove = " + remove);
        System.out.println(" myArray2= " + Arrays.toString(myArray));
        //convert it to array
        Object[] myArray3 = mySet.toArray();
        System.out.println("objects = " + Arrays.toString(myArray3));
    }
}
