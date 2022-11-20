package uniqueAndDuplicate;

import java.util.Scanner;

public class frequencyOfChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inter word please=");
        String str =  scan.next();
        System.out.println("inter a charachter=");

        char ch = scan.next().charAt(0);
        scan.close();
//        String str = "ASDFASDaaaaaaaaaaa";// another option manually done
//        char ch = 'B';
        String unique = "";

        int frequecy = 0;
        for (int i = 0; i < str.length(); i++) { // iterate te word from 0
            if (ch == str.charAt(0)){
                frequecy ++;
            }


        }
        if (frequecy == 1){
            unique += ch;
        }
    }
}