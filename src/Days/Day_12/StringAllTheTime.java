package Days.Day_12;

import java.util.Scanner;

public class StringAllTheTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your name please=");
       String first =  scan.next();
        System.out.println("Enter you family name=");
       String second = scan.next();
        System.out.println("");


        System.out.println(first.charAt(0)+"."+second.charAt(0));
    }
}
