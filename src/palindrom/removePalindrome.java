package palindrom;

import java.awt.datatransfer.FlavorListener;
import java.util.*;

public class removePalindrome {
    public static void main(String[] args) {
        String[] words = {"level", "ana", "RaceCar", "wafu", "xebeke","teare","ana"};

        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(words));

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String str = it.next();

            StringBuilder reverse = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) {
                reverse.append(str.charAt(i));

            }
            if (reverse.toString().equalsIgnoreCase(str)){
                it.remove();
            }

        }
        System.out.println(list);

        System.out.println("--------------------");

        List<String >list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(words));

        List<String> nonPalindrom = new ArrayList<>();

        for (String each : list1) {

            String reversed = "";
            for (int i = each.length() - 1; i >= 0; i--) {

                reversed += each.toCharArray()[i];

            }
            if (reversed.equalsIgnoreCase(each)) {
                continue;            }
            nonPalindrom.add(each);
        }


        System.out.println(nonPalindrom);
        System.out.println("-------------------");

        Integer[] num = {1, 2, 3, 4, 1, 2};

        Set<Integer> list2 = new LinkedHashSet<>();
        list2.addAll(Arrays.asList(num));
        System.out.println(list2);

        list2.removeIf(p -> p%2 == 0);

        System.out.println(list2);



        }
    }
