package anagram;

import java.util.Arrays;



public class IsAnagramCharArray {
    public static boolean areAnagram(char[] str1, char[] str2) {
        int n1 = str1.length;
        int n2 = str2.length;

        if (n1 != n2) {
            return false;
        }
        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < n1; i++)

            if (str1[i] != str2[i])
                return false;
                return true;

        }
            public static void main(String[] args) {
                char[] xx = {'a', 'b', 'i', 'l','m'};
                char[] yy = {'a', 'l', 'i', 'b'};
                if (areAnagram(xx, yy))
                    System.out.println(" True ");

                 else
                    System.out.println(" False ");
                }
            }
