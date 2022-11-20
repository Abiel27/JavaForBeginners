package Days.Day_12;

import java.util.Scanner;

public class ScannerInoutTraining {
    public static void main(String[] args) {
        Scanner abi= new Scanner(System.in);
        System.out.println("Please Enter number!");
        int x = abi.nextInt();
        int y = abi.nextInt();

        System.out.println("Type name  = ");
        abi.next();



        int sum = x + y;
        System.out.println("Total is=" + sum);
    }
}
