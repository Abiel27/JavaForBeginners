package FirstAndLastLEtterTheSame;

import java.util.Locale;

public class countWordsWithFirstSecondLetterSame {

    public static void main(String[] args) {
        String[] words = {"ana", "Level", "hana", "racecare"};

        int count = 0;

        for (String each : words) {

            char firstLetter = each.toLowerCase().charAt(0);
            char lastLetter = each.toLowerCase().charAt(each.length()-1);

            if (firstLetter == lastLetter) {
                count++;
            }
        }
        System.out.println(count);

    }
}
