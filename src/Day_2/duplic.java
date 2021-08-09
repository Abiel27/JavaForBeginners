package Day_2;

public class duplic {
    public static void main(String[] args) {
        String xy  = "ZXCV Abiel Abiel abiel Rahwa Rahwichi";
        System.out.println(removeDup(xy));

    }
    public static  String  removeDup( String  str) {

        String result = "";

        for (int i = 0; i < str.length(); i++)

            if (!result.contains("" + str.charAt(i)))

                result += "" + str.charAt(i);

        return result;

    }




}
