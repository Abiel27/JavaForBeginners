package frequency_3;

public class CountFrequencyOfChar {
    public static void main(String[] args) {

//        Scanner scan= new Scanner(System.in);
//        System.out.println("inter your word=");
        String myWord = "&&&@@@###";
        String result = "";
       // char ch ;
        //System.out.println("Eineter charaachter=");

        for (int j = 0; j <= myWord.length() - 1; j++) {


            // close scanner if finish;

            int frequency = 0;
            for (int i = 0; i <= myWord.length() - 1; i++) {
                if (myWord.charAt(j)== myWord.charAt(i)) {
                    frequency++;
                }
            }
            if (result.contains(myWord.charAt(j)+"")) {//if result contain elements in outer loop skip it,
                continue;// this will skip the redonedone,
                // if the char alreay in the result skip it.


            }
            result += frequency +"" + myWord.charAt(j) ;


        }
        System.out.println(result);

    }}
