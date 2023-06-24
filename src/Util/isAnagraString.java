package Util;

import java.util.Arrays;

public class isAnagraString {
    //if two strings have the same value they are anagram
    public static void main(String[] args) {
        String str = "silent";
        String str2 = "listen";

        char[] ch1 = str.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean isanagram = Arrays.equals(ch1, ch2);
        System.out.println("isanagram = " + isanagram);


    }

            }
