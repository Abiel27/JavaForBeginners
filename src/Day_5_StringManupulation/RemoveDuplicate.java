package Day_5_StringManupulation;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String xyzx = "AbielAbiel hahaha hahaha ha";

        System.out.println("xyzx = " + removeDup(xyzx));

    }
    public static  String  removeDup( String  str) {

            String result = "";

            for (int i = 0; i < str.length(); i++)

                if (!result.contains("" + str.charAt(i)))

                    result += "" + str.charAt(i);

            return result;

        }


    }
