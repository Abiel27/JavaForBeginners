package Days.Day_5_StringManupulation;

public class reverseString {
    public static void main(String[] args) {
        String reverse = "Bobi";

        System.out.println("reverse = " +   stringReverse(reverse) );

    }
    public static String stringReverse(String str) {
        String revert = ""; // this is like a cup accumulation

        for (int i = str.length() - 1; i >= 0; i--) {
            revert += str.toCharArray()[i];
        }
        return revert;

    }}


