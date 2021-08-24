package Day_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class uniqueAlphabets {
    public static void main(String[] args) {
        String[] words= {"Rahwa","Abiel","ana","level"};
        List<String>  list= new ArrayList<>(Arrays.asList(words));


        Iterator<String>  it= list.iterator();
        while (it.hasNext()){
            String each = it.next();

            String reversed = "";
            for (int i = each.length() - 1;i>=0; i--) {
                 reversed += each.charAt(i);


            }
                 if (each.equalsIgnoreCase(reversed))
                     it.remove();

            }
        System.out.println("list = " + list);


        }




    }



    
