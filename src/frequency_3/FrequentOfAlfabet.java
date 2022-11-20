package frequency_3;

public class FrequentOfAlfabet {
    public static void main(String[] args) {

        String word = "turbulenc";
        String result = "";


        for (int j=0 ; j <= word.length()-1; j++){
            char ch = word.charAt(j);

            int frequency = 0;
            for (int i=0; i <= word.length()-1; i++){
               if (ch == word.charAt(i)){
                   frequency++;
               }
               if (result.contains(""+ch)){
                   continue; //meaning skip
               }

            }
            result += ""+ch+frequency;

        }
        System.out.println("result = " + result);

    }
}
