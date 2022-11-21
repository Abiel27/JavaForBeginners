package anagramCompareTwoWords;

import java.util.Arrays;

public class compareTwoStringIfEqual {
    //compare two string if equal then they are Anagram(isAnagram or not)
    /* convert the two string to the same format like uppercase or lowercase
    *then change them to Array by using split method
    * third step sort the array using sort method
    * then finaly use equals method to compare the two array if they are anagram
     */
    public static void main(String[] args) {
        String str1 = "menghistu";
        String str2 = "MenghistU";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean isAnagram = Arrays.equals(arr1, arr2);
        System.out.println(isAnagram);

    }
}
