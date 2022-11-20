package uniqueAndDuplicate;

public class FrequencyOfCharInAword {
    public static void main(String[] args) {
//        Scanner scan= new Scanner(System.in);
//        System.out.println("inter your word=");
        String myWord= "turbuuu";

        System.out.println("Eineter charaachter=");

        char ch = myWord.charAt(1);
        // close scanner if finish;

        int frequency = 0;
        for (int i = 0; i < myWord.length(); i++) {
            char ch2 = myWord.charAt(i);

            if (ch == ch2){
                frequency++;
            }
        }
        System.out.println(frequency);
    }}