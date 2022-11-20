package frequency_3;

public class finsFrequencyAndRemoveDuplicates {
    public static void main(String[] args) {


        String str = "asasssasddffl";// find frequency

        String resu = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (ch == str.charAt(i)) ;
                count++;
            }
            if (count == 2 && !resu.contains(""+ch)){
                continue;
            }
        }
        System.out.println(resu);


    }
}

