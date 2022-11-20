package frequency_3;

public class FrequencyOfLettersReoveDuplicateFromResult {
    public static void main(String[] args) {
        String str = "kkkkdo";
        String resu = "";

        for (int j = 0; j <= str.length() - 1; j++) {
            char alpha = str.charAt(j);


            int count = 0;
            for (int i = 0; i <= str.length() - 1; i++) {
                if (alpha == str.charAt(i)) {
                    count++;
                }
                }
                if (resu.contains("" + alpha)) {
                    continue; //skips
                }
                resu += "" + alpha + count;


            }
        System.out.println("resu = " + resu);


        }

    }
