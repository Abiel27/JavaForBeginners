package day_10;

import java.util.Scanner;

public class factorialOfANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  number = scanner.nextInt();
        int fact = 1;
        //your code goes here
        while( number>=1 ) {
            fact*=number--; }
        System.out.println(fact);

    }
}

