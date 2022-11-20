package uniqueAndDuplicate;

import java.util.Scanner;

public class UniqueAndDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inter word please=");
        String str = scan.next();
        // System.out.println("inter a character=");



//        String str = "ASDFASDaaaaaaaaaaa";// another option manually done
//        char ch = 'B';


        String unique = "";
        String duplicate = "";

        for (int j=0; j<=str.length()-1; j++){

            char ch = str.charAt(j);// 'a','b','c','d','e'

            int frequecy = 0; // frequency of ch
            for (int i = 0; i < str.length()-1; i++) { // iterate the word from or just one charachter and next
                if (str.charAt(i) == ch){
                    frequecy ++;
                }

            }
            if (frequecy == 1){ // if frequency is equal to 1 it id unique
                unique += ch;
            }
            if (frequecy > 1 && !duplicate.contains(""+ch)){ // if it is more than one happening then it is duplicate
                //&& !duplicate.contains(""+ch) inorder to contain single char,
                duplicate += ch;
            }

        }
        System.out.println(unique);
        System.out.println(duplicate);
        boolean contains = str.contains(duplicate);// Isoterm results
        System.out.println(contains);


    }
}

