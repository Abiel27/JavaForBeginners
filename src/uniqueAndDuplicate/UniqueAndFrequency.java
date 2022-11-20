package uniqueAndDuplicate;

public class UniqueAndFrequency {
    public static void main(String[] args) {



        String str = "mama and papa";

        String unique = "";
        String duplicate = "";

        for (int j=0; j<=str.length()-1; j++){

            char ch = str.charAt(j);// 'a','b','c','d','e'

            int frequecy = 0; // frequency of ch
            for (int i = 0; i < str.length()-1; i++) { // iterate the word from or just one charachter and next
                if (str.charAt(i) == ch) {
                    frequecy++;
                }
            }


            if (frequecy == 1){ // if frequency is equal to 1 it id unique
                unique += ch;
            }
            if (frequecy > 1){ // if it is more than one happening then it is duplicate
                duplicate += ch;
            }


    }
        System.out.println(duplicate);
        System.out.println(unique);


    }



    }
