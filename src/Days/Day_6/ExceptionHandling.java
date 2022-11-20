package Days.Day_6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {
        public static void main(String[] args) {
            String str = "Cybertek";

            str += 200;
            System.out.println(str);
            try {
                System.out.println(str.charAt(200));

            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("tring Index Out Of  BoundsException");
//          e.printStackTrace();//this methos help to print line // 16
            }
            System.out.println("last print bc ");

            try {
                FileInputStream file = new FileInputStream("");
            } catch (FileNotFoundException e) {
                e.printStackTrace();//full report
            }

            System.out.println("Test completed");


        }
        public static void sleep(double Second) throws InterruptedException {
            long millisecond = (long)(Second * 1000);
            Thread.sleep(3000);

        }

    }

