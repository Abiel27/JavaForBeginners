package Day_5_StringManupulation;

public class reverseString {


    public static void main(String[] args) {
        String xyzx= "Rahwa";
        System.out.println("(xyzx) = " + stringReverse(xyzx));

    }
    public static String stringReverse(String str) {
        String xyz = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            xyz += str.toCharArray()[i];
        }
        return xyz;

    }}
