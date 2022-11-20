package removeEvenFromCollection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveEvenWithRemoveIfMethod {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 1, 2, 3};

        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(Arrays.asList(numbers));

        set.removeIf(abi -> abi % 2 == 0);
        System.out.println("set = " + set);
    }


    }
