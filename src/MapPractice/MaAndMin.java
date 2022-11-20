package MapPractice;

import java.util.HashMap;
import java.util.Map;

public class MaAndMin {
    public static void main(String[] args) {


        Map<String, Integer> map = new HashMap<>();

        map.put("moon", 1200);
        map.put("sun", 1230);
        map.put("night", 2400);
        map.put("tree", 23000);
        System.out.println("map = " + map);

        String nameMax = "";
        Integer max = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> eachEntrySet : map.entrySet()) {
            String name = eachEntrySet.getKey();
            Integer salary = eachEntrySet.getValue();

            if (salary > max) {
                salary = max;
                name = nameMax;

            }
        }
        System.out.println(nameMax);
        System.out.println(max);

    }
}