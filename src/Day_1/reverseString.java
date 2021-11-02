package Day_1;

public class reverseString {
    public static void main(String[] args) {
        String str = "Rahwa";
        String revert = "";
        for (int i = str.length()-1; i >= 0; i--){
            revert += "" + str.charAt(i);

        }
        System.out.println("revert = " + revert);
    }

}
