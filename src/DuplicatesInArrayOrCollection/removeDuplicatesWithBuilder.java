package DuplicatesInArrayOrCollection;

public class removeDuplicatesWithBuilder {
    //create a method that ignore duplicate by equating
    public static void main(String[] args) {
        String str4 = "abiel abiel s M";
        System.out.println("ignorDup(str4) = " + ignorDup(str4));

    }


    public static StringBuilder ignorDup(String str) {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (result.toString().contains(""+str.charAt(i))) {
                result.append(str.charAt(i));

            }

        }

        return result;
    }
}


