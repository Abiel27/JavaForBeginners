package day_9;

import java.util.*;

public class practiceSet {
    static String str3;

    public static void main(String[] args) {

        Set<String> names1 = new HashSet<>();
        names1.addAll(Arrays.asList("Abiel","abiel" , "Adnan", "Hoshang", "Hoshang"));
        System.out.println(names1);


        System.out.println("=========================num2========================");
//
      Set<String> names2 = new LinkedHashSet<>();
        names2.addAll(Arrays.asList("Abiel","Abiel" , "Adnan","Serhii" , "Ercan", "Hoshang", "Hoshang", "Hoshang", "Hoshang", "Hoshang", "Hoshang"));
        System.out.println(names2);

        System.out.println("========================nnnnn=====================");
        Set<String> names3 = new TreeSet<>();
        names3.addAll(Arrays.asList("Rahwit","Abiel","Abiel","Daniel","Ruslan" , "Adnan","Serhii" , "Ercan", "Hoshang", "Hoshang", "Hoshang", "Hoshang", "Hoshang", "Hoshang"));
        System.out.println(names3);

        System.out.println("====================mmm================================");

        String str = "abielabielRahwit";  // gabc
        String res = "";

        for (String xing :
                new HashSet<>(Arrays.asList(str.split(""))))
        {
            res += xing;

        }
        System.out.println("res = " + res);

//
//          String[] arr = str.split("");  // [g, g, g, a, a, a, b, b, b, c, c, c]
//
//        LinkedHashSet<String> hs = new LinkedHashSet<>( Arrays.asList( str.split("") )  );  // [g, a, b, c]
//
//        for (String each : hs) {
//            result += each;
//        }
//
//        // System.out.println(hs.get(0));
//
//        System.out.println(result);}}
//
        System.out.println("=========================llll==============================");

        String str1 = "Abiels";
        String str2 = "Abiels";

        String s1 = new TreeSet<>(  Arrays.asList( str1.split("") ) ).toString()  ;
        String s2 =  new TreeSet<>(  Arrays.asList( str2.split("") ) ).toString()  ;

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1.equals(s2));

//
        System.out.println("=============================kkkk===============================");

        // Null key:

//        System.out.println(str3);
//
//            System.out.println( str3.toUpperCase() );

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(null,1,2,null));

        System.out.println(hashSet);
//
//
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(null, null, null, null, null));

        System.out.println(linkedHashSet);
//
//
        TreeSet<Integer> treeSet = new TreeSet<>();
           treeSet.addAll(Arrays.asList(1,3,4));
         System.out.println(treeSet);

//        //  String str4 = null;
//
//        // System.out.println( str4.equals( "Muhtar" ));
//
//
        System.out.println("======================WALA=======================");
//
        Set<Integer>  numbers = new HashSet<>();
        numbers.addAll( Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,5,5,5,5,5,5,5,5,5)  );

        int  maxNum = Collections.max(numbers);
        int min = Collections.min(numbers);
        System.out.println("min = " + min);

        // Collections.sort(numbers);

//          Collections.swap(numbers, 0 , 1);}}
//
         int fre=Collections.frequency(numbers,5);
        System.out.println("fre = " + fre);

//        System.out.println("maxNum = " + maxNum);
//        System.out.println("min = " + min);
//
//
        System.out.println("========================Yahoooooooooo==============================");}}
//
//        /*
//        dddaaaaccbb
//                    dacb
//                    3422
//        output:
//            d3a4c2b2
//         */
//
//
//
//
//
//
//
//    }
//
//}

