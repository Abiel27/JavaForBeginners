package duplicates;

public class Remove_Duplicate_From_String {
    public static void main(String[] args) {
        String word = "aaabbcccfsx";
        String unique = "";//abc
        String removeDuplicate = "";//abc

        for (int j=0 ; j<=word.length()-1; j++){
            char ch = word.charAt(j);

            int count = 0;
            for (int i=0 ; i<=word.length()-1; i++){
                if (word.charAt(i) == ch ){
                    count++;

                }
            }
            if (count == 1){
                unique += ch;
            }
            if (!removeDuplicate.contains(""+ch) ){//
                removeDuplicate += ch;
            }

        }
        System.out.println(removeDuplicate);
        System.out.println("unique = " + unique);
    }
}
