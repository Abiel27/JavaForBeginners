package Days.Day_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class addNonPalindrome {
    public static void main(String[] args) {
        //given string array remove the palindrome
        //with out using iterabel and lamda methods

        String[] words = {"abiel", "rahwit", "carrac", "anna","696","432", "rahwit"};
        List<String> list1 = new ArrayList<>(Arrays.asList(words));

        List<String> noPalindrome = new ArrayList<>();

        for (String each : list1) {

            String reversed = "";
            for (int i = each.length() - 1; i >= 0; i--){
                reversed += each.charAt(i);
            }
            if(reversed.equalsIgnoreCase(each)){
                continue;

            }
            noPalindrome.add(each);


            }
        System.out.println("noPalindrome = " + noPalindrome);






    }}