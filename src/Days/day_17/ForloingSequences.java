package Days.day_17;

public class ForloingSequences {
    public static void main(String[] args) {
        String str = "Rahwit";
        //String str2 = "Abie";


        String xxx= "";

        for (int i = str.length()-1; i>=1; i--){
            xxx += str.charAt(i);
        }

        System.out.println("xxx = " + xxx);

    }
}
