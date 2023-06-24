package frequency_3;

public class finsFrequencyAndRemoveDuplicates {
    public static void main(String[] args) {


        String str = "asa!";// find frequency

        String resu = "";

        for (int j = 0; j <= str.length()-1; j++) {
            char ch = str.charAt(j);


            int count = 0;
            for (int i = 0; i <= str.length()-1; i++) {
                if (ch == str.charAt(i)) ;
                count++;
            }
            if (count > 1 ){
                continue;
            }
        }
        System.out.println(resu);


    }
}

