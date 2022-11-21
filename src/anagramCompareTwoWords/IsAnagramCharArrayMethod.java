package anagramCompareTwoWords;

import java.util.Arrays;



public class IsAnagramCharArrayMethod {
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
                char[] x = {'a', 'b', 'i', 'l'};
                char[] y = {'a', 'l', 'i', 'b'};
                if (areAnagram(x, y))
                    System.out.println(" True ");

                 else
                    System.out.println(" False ");
                }
            }
