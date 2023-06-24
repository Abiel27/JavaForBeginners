package frequency_3;

public class FrequncyOfAlfabetsInAString {
    public static void main(String[] args) {

        String string = "asdfasdf";
                              //  012345 //index
        String result ="";// 2as2


        for (int j = 0; j <= string.length()-1; j++) { //elements iterator
            char ch = string.charAt(j);

            int count = 0;
            for (int i=0; i<=string.length()-1; i++){ //index iterator
                char ch2 = string.charAt(i);
                if (ch == ch2 ){
                    count++;
                }
                }
            if (result.contains(""+ch)){
                continue; // skip the repeated alphabet

            }
                        //a2s2
            result += ""+ch+count;

        }
        System.out.println("result = " + result);




    }
}
