package frequency_3;

import javax.swing.plaf.IconUIResource;

public class contLettersInString {
    public static void main(String[] args) {
        String str = "abieldasdf abielsdfa me mensdfl;kjlll;;;;;; you s";

        String result = "";
        for (int i = 0; i <= str.length() - 1; i++) {


            int count = 0;
            for (int j = 0; j <= str.length() - 1; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }

            }
            if (result.contains(str.charAt(i) + "")) {
                continue;

            }
            result += count + "" + str.charAt(i);


        }
        System.out.println("myResu ="+result);


    }
}
