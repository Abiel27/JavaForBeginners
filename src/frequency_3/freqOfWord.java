package frequency_3;

public class freqOfWord {
    public static void main(String[] args) {

        String str = "dog dog this dog";
        String word = "dog";

        int count= 0;
        while (str.contains("dog")) {
           str = str.replaceFirst(word, "");
            count++;
        }
        System.out.println(count);
    }
}
