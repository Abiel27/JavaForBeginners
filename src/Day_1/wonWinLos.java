package Day_1;

import java.util.Scanner;

public class wonWinLos {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean isSuspended = read.nextBoolean();
        int ourScore = read.nextInt();
        int theirScore = read.nextInt();

        if(isSuspended) {
            System.out.println("Suspended");

        }else if(ourScore==theirScore) {
            System.out.println("Draw");
        } else if(ourScore>theirScore){
            System.out.println("Won");
        }else if(theirScore > ourScore){
            System.out.println("Lost");



        } else {
            System.out.println("Huhahah hahahahahahah huhuhuhhahhahahah");
        }
    }
}

