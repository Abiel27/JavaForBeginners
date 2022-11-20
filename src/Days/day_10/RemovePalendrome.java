package Days.day_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalendrome {
    public static void main(String[] args) {
        String[] words = {"Level", "Anna", "Abiel", "mana", "Anna", "Carrac", "Abiel"};
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(words));
       // System.out.println("list = " + list);


        Iterator<String> it = list.iterator();
       while(it.hasNext()){
            String each = it.next();

            String rev = "";
            for (int i = each.length()-1; i >= 0; i--) {
                rev += ""+each.charAt(i);
            }
            if (each.equalsIgnoreCase(rev)){
                it.remove();
            }

        }
        System.out.println("words = " + list);

    }
}