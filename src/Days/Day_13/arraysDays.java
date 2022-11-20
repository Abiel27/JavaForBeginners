package Days.Day_13;

import java.util.Scanner;

public class arraysDays {
    public static void main(String[] args) {
        String [] days = {"Mon", "tue","wed","thu","Fri","sat","sun"};
        System.out.println("Give your number=");
        int x = new Scanner(System.in).nextInt();

        if (x >= 1 && x<=7){
            System.out.println(days[x-1]);//7


        }else {
            System.out.println("invalid Number");
        }
    }
}
