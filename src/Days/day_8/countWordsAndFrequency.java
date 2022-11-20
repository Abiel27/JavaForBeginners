package Days.day_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class countWordsAndFrequency {
    public static void main(String[] args) {
        String xxx = "this is is interesting";
        countDups(xxx);
        System.out.println("xxx = " + xxx);

    }
    public static void countDups(String str) {

      ArrayList<String> words= new ArrayList<>(Arrays.asList(str.split("")));

        // converted String to ArrayList of Strings
        String result = "";
        for(String each : words) {

            if(!result.contains(each)) {
                int freqOfEach = Collections.frequency(words, each); // Ready method
                System.out.println(each + ": " + freqOfEach);
                result += each+ " ";
            }
        }

    }
}
