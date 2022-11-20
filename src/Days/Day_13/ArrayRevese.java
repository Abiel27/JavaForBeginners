package Days.Day_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayRevese {
    public static void main(String[] args) {
        String[] arr = {"Abiel", "Rahwit", "Hosi","Aboy","Almi","Hosi"};
        System.out.println(arr);
        List<String> myList = new ArrayList<>(Arrays.asList(arr));
       myList.add("Milli");
        System.out.println(myList);
        //-----------------------
        System.out.println(myList);

        int size = myList.size();
        System.out.println(size);
        //--------------------------

        Iterator<String> it = myList.iterator();
        while (it.hasNext()){
            String element = it.next();
            // for (String each: myList) {
          //  System.out.println(each.substring(0,2));
            String revese = "";
           for (int i = element.length()-1; i>=0 ; i--){
               revese += element.charAt(i);
           }
            System.out.println(revese);

        }



        }

    }
