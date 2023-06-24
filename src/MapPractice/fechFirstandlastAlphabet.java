package MapPractice;

import java.awt.datatransfer.StringSelection;
import java.util.*;

public class fechFirstandlastAlphabet {
    public static void main(String[] args) {


        Map<String, String> map = new HashMap<>();
        //second cup iss needed
        Map<String, String> strings = new HashMap<>();

        map.put("moon", "me");
        map.put("sun", "bright");
        map.put("night", "dark");
        map.put("tree", "green");
        System.out.println("map = " + map);
        System.out.println("------------------------");

        for (Map.Entry<String, String> eachEntry : map.entrySet()) {
            System.out.println("eachEntry = " + eachEntry);






        }

    }}