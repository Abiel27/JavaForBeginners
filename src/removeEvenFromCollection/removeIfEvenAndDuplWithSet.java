package removeEvenFromCollection;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeIfEvenAndDuplWithSet {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 1, 2, 3};

        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(numbers));

        set.removeIf(integer -> integer % 2 == 0);
        System.out.println(set);


    }

}
