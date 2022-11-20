package Days.Day_11;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeEvenNumbers {
    public static void main(String[] args) {
        //given Intiger array
        Integer [] arr = {1,2,3,4,5,4,33,2,1,2,3,4};
        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(set);
//        for (Iterator<Integer> it = set.iterator(); it.hasNext(); ){
//            Integer p = it.next();
//            if( p % 2 == 0) {
//                it.remove();
//            }
//        }
//        System.out.println(set);

        set.removeIf(p -> p % 2 == 0);
        System.out.println(set);
    }
}
