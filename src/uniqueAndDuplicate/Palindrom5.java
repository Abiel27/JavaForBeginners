package uniqueAndDuplicate;

import java.util.*;

public class Palindrom5 {
    public static void main(String[] args) {
        String[] myNum= {"carac","Abiel","anna","Abiel","Abiel","Anna"};
        Set<String > set= new HashSet<>(Arrays.asList(myNum));

         // System.out.println(set);

        Iterator<String> it  = set.iterator();
//
        while (it.hasNext()){
           String xxx  =it.next();

//
           String revese = "";
        for (int i = xxx.length()-1; i >=0 ; i--) {
            revese += "" + xxx.charAt(i);
        }
            if (xxx.equalsIgnoreCase(revese)){
               it.remove();
            }
        }
            System.out.println(set);


        }


    }
