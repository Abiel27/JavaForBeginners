package Days.Day_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Palendrom {
    public static void main(String[] args) {
        //given string array, remove the palindrome words
        String[] words = {"abiel","rahwit","carrace","anna","rahwit"};
        //tale the object array to the collection iterable
        List<String> myList = new ArrayList<>(Arrays.asList(words));

        Iterator<String> it = myList.iterator();

        while (it.hasNext()){

            String each = it.next();
            String reversed = "";
        for (int i= each.length()-1; i>=0 ; i--) {
            reversed += each.charAt(i);
        }
        if (reversed.equalsIgnoreCase(each)){
            it.remove();
        }
        }
        System.out.println(myList);
    }
}
