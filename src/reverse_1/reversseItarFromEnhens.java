package reverse_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class reversseItarFromEnhens {
    public static void main(String[] args) {
        String[] words = {"level", "ana", "RaceCar", "wafu", "xebeke","teare","ana"};

        List<String> list = new ArrayList<>(Arrays.asList(words));

        Iterator<String> it = list.iterator();

        for (String str : list) {



            String rever = "";
            for (int i = str.length()-1; i>=0; i--) {
                rever += str.charAt(i);

            }
            if (rever.equals(str)) {
                it.remove();
            }

        }
        System.out.println("list = " + list);


    }
}
