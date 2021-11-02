package Day_2;

import java.util.Scanner;

public class ifStatementElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = scanner.nextDouble();
        // your code goes here

        if(grade >3.5){
            System.out.println("Congratulation");
        }else{
            System.out.println("sorry");
        }


    }
}


