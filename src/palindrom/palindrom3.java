package palindrom;

import java.util.*;

public class palindrom3 {

    public static void main(String[] args) {
        String[] words = {"level", "ana", "RaceCar", "wafu", "xehaytu","Korfaf","ana"};

        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(words));

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String str = it.next();

            String reverse = "";
            for (int i = str.length()-1; i>=0 ; i--) {
                reverse += str.charAt(i);


            }
            if (reverse.equalsIgnoreCase(str)) {
                it.remove();
            }



        }
        System.out.println("myList="+list);
        System.out.println("-----------------------");

        List<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(words));

        List<String> nonPalindrom = new ArrayList<>();


        for (String each : list3) {

            String reversed = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                reversed += each.charAt(i);
            }
            if (each.equalsIgnoreCase(reversed)) {
                continue;
            }
            nonPalindrom.add(each);

                    }
        System.out.println("my nonPalin=="+nonPalindrom);


        System.out.println("-------------------------");

        Integer[] num = {1, 23, 34, 2, 3, 2, 4,4};// my collection

        Set<Integer> list1 = new LinkedHashSet<>();// mu first cup contains set of collection
        list1.addAll(Arrays.asList(num));

        System.out.println(list1);
        System.out.println("-------------------------");

        list1.removeIf(p -> p%2 == 0);
        System.out.println(list1);


    }
}



