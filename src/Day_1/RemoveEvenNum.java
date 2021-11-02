package Day_1;

import java.util.*;

public class RemoveEvenNum {
    public static void main(String[] args) {
        Integer[] arr = {1, 3, 2, 4, 5, 6, 6, 7, 8, 3, 2};
        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(Arrays.asList(arr));
//        for (Iterator<Integer> it= set.iterator(); it.hasNext(); ){
//            Integer p = it.next();
//            if (p%2 == 0){
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            if (it.next() % 2 == 0) {
                it.remove();

            }

        }
        System.out.println("arr = " + set);

    }



}
