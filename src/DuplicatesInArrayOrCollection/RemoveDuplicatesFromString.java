package DuplicatesInArrayOrCollection;

public class RemoveDuplicatesFromString {
    //create amethod that is going to ignore if duplicate character
    public static void main(String[] args) {
        String str3 = "abiel abiel mmm";
        System.out.println("ignoreDuplicates(str3) = " + ignoreDuplicates(str3));

    }

    public static String ignoreDuplicates(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += str.charAt(i);

            }


        }
        return result;
    }
}