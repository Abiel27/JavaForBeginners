package Days.day_10;

import java.util.*;

public class ConvertStringArrayToCollectionAndArray {
    public static void main(String[] args) {
        String [] myArray = {"ah","df","dff","fdf","red"};
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(myArray));
        System.out.println("list = " + list);
        list.remove(4);
        System.out.println("list = " + list);
        Set<String> set = new TreeSet<>();
        set.addAll(Arrays.asList(myArray))    ;





    }
}
