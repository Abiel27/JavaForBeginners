package Days.Day_1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeEvenLamda {
    public static void main(String[] args) {


        Integer[] numbers = {1, 2, 3, 4, 5, 6, 4, 3, 2, 1, 1};
        Set<Integer> kudo = new LinkedHashSet<>(Arrays.asList(numbers));
        kudo.removeIf(p -> p %2 == 0) ;
        System.out.println("kudo = " + kudo);
        

        }





    }

