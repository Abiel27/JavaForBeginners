package Day_1;

import java.io.*;


public class sumOfDigitsFinalToZero {

// sum of digits in number.
/* Function to get sum of digits */
        static int getSum(int n)
        {
            int sum = 0;

            while (n != 0) {
                sum = sum + n % 10;
                n = n / 10;
            }

            return sum;
        }

        // Driver code
        public static void main(String[] args)
        {
            int n = 400;

            System.out.println(getSum(n));
        }
    }


// This code is contributed by Gitanjali
