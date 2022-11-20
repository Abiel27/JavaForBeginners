package Days.Day_6;

import java.util.Arrays;

public class loopsWithConditions {
    public static void main(String[] args) {

        int[] scores = {4, 16, 3, 18,23,12};
        for (int unitScore:    scores){
            if (unitScore > 12){
                break;
            }
            System.out.println("unitScore = " + unitScore);

        }
        System.out.println(Arrays.toString(scores));

    }


}
