package myUtilMethods;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeEven {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 4, 3, 2, 1, 4, 12,14,16,5, 4, 3, 2, 1};
        Set<Integer> xxx = new LinkedHashSet<>();
        xxx.addAll(Arrays.asList(numbers));
        xxx.removeIf(p->p%2 == 0);
        System.out.println("xxx1 = " + xxx);


    }

    }

