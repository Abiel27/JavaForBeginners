package removeEvenFromCollection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveEvenFromcollectionWhileLoop {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 1, 2, 3};

        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(Arrays.asList(numbers));

        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            if (it.next() % 2 == 0) {
                it.remove();
            }
        }
        System.out.println(set);


    }
}
