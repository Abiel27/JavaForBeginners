package Days.Day_6;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReplaceDuplicatesByX {
    static Character[] input={'a','b','b','a','c','a','s','s','f','f','r','r','w','q','d','s','f'};

    public static List<Character> ReplaceByX(Character[] chars) {

        List<Character> list= new LinkedList<Character>();

        for (int i = 0; i < chars.length; i++) {
            
            if(!list.contains(chars[i])){
                list.add(chars[i]); }
            else{list.add('x');}
        }
        return list;

    }


    public static void main(String[] args) {

        System.out.println("Original input:"+ Arrays.toString(input));
        System.out.println("duplicateReplacedByCharX(input) = " + ReplaceByX(input));

    }
    /*
    Given an array of characters,
     write a method/function
     to return an array where duplicate characters have been replaced with the letter ?x?.
     input = [a, b, b, a, c, a] output = [a, b, x, x, c, x]
     */
}
