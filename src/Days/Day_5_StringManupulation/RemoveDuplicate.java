package Days.Day_5_StringManupulation;

public class RemoveDuplicate {

    public static void main(String[] args) {

        String str1 = "AbielAbiel hahaha hahaha ha";
        System.out.println("str1 = " + removeDup(str1));

    }
    public static  String  removeDup( String  str) {

            String result = "";

            for (int i = 0; i < str.length(); i++)

                if (!result.contains("" + str.charAt(i)))

                    result += "" + str.charAt(i);

            return result;

        }


    }
