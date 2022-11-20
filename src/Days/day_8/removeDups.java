package Days.day_8;

import java.util.ArrayList;

public class removeDups {
    public static void main(String[] args) {
    }
    public static int[]  removeDuplicates(int[] arr){
        ArrayList<Integer> list = new ArrayList<>(); //[1, 2, 3,4 ]

        for(int each : arr) {
            if (!list.contains(each)) {
                list.add(each);
            }
        }

        int[] nonDup = new int[list.size()]; // [1,2,3,4]

        for(int i = 0; i <= nonDup.length-1; i++) {
            nonDup[i] = list.get(i);
        }

        return nonDup;
    }
}