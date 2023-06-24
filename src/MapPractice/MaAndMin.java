package MapPractice;

import java.util.HashMap;
import java.util.Map;

public class MaAndMin {
    public static void main(String[] args) {


        Map<String, Integer> map = new HashMap<>();

        map.put("moon", 12);
        map.put("sun", 10);
        map.put("night", 24);
        map.put("tree", 23);


        String nameMax = "";
       int max = Integer.MAX_VALUE;
        for (Map.Entry<String, Integer> eachEntrySet : map.entrySet()) {
            String name = eachEntrySet.getKey();
            Integer salary = eachEntrySet.getValue();

            if (salary > max) {
                salary = max;
                name = nameMax;

            }

        }
        System.out.println("=="+max);
        System.out.println("=="+nameMax);



    }

}