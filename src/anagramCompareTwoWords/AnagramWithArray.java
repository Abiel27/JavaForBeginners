package anagramCompareTwoWords;

import java.util.Arrays;

public class AnagramWithArray {
    public static boolean isAnagram(char[] str1, char[] str2){

        int x = str1.length;
        int x2 = str2.length;

        if (x != x2)
            return false;

        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < x; i++)
            if (str1[i] != str2[i])
                return false;
        return true;

        }

    public static void main(String[] args) {
        char[] ch1 = {'a','s','d','f'};
        char[] ch2 = {'a','d','f','s'};

        if (isAnagram(ch1,ch2))
            System.out.println(" True");
        else
            System.out.println("false");
    }

    }
