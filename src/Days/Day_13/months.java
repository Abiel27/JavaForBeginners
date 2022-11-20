package Days.Day_13;

import java.util.Scanner;

public class months {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number!");

        int x = scan.nextInt();
        System.out.println();
        System.out.println("Second number=");
        int y = scan.nextInt();

        switch (x ){
            case 0:
            System.out.println("This month is Jan");
            break;
            case 9:
                System.out.println("This month is Jan");
                break;
            case 10:
                System.out.println("This month is Oct");
                break;
            case 11:
                System.out.println("This month is Nev");
                break;
            case 12:
                System.out.println("This month is DEC");
                break;
            default:
                System.out.println("the month is not on the list");


        }}}


