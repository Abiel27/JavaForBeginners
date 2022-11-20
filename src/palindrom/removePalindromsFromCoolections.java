package palindrom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class removePalindromsFromCoolections {
    public static void main(String[] args) {
        String[] myWord = {"racecar","ana","level","you","696","515"};

        List<String> myList = new ArrayList<>();
        myList.addAll(Arrays.asList(myWord));

        Iterator<String> it = myList.iterator();

        while (it.hasNext()) {
            String str = it.next();

            StringBuilder rever = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) {
                rever.append(str.charAt(i));

            }
            if (rever.toString().contains(str)) {
                it.remove();
            }

        }
        System.out.println(myList);




    }




}
