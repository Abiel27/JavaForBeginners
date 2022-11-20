package Days.Day_11;

import java.util.Scanner;

public class averageOfThreeNum {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println(" Enter your number please! " );
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();

        int averageOfThree = (x+z+y)/3;
        System.out.println("averageOfThree = " + averageOfThree);

    }
}
