package Day_11;

import java.util.Scanner;

public class day_11
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many number would you like to enter?");
        int length = scan.nextInt();

        double[] numbers = new double[length];

        for(int i = 0; i <= length-1; i++){  // gets the user inputs and stores into the array starting from index 0
            System.out.println("Enter a number");
            numbers[i] = scan.nextDouble();
        }

        double min = numbers[0];
        double max = numbers[0];

        for(int i = 1 ; i <= length-1; i++ ){
            if(numbers[i] > max){
                max = numbers[i];
            }

            if(numbers[i] < min){
                min = numbers[i];
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }

}


