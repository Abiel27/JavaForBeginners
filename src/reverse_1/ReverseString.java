package reverse_1;

public class ReverseString {
    public static void main(String[] args) {
        String word = "Hello my loved ones, my family how beautiful you are.\n" +
                "I love you . I am so glad I gat time to express my feelings. Its gathering time. Your " +
                "laughter and joy is here. So be happy today never look back. Thanks, God, for this day. Abeil.M\n";

        String reverse = "";

        for (int i = word.length()-1; i>=0; i--){
            reverse += word.charAt(i);
        }
        System.out.println("reverse = " + reverse);
    }
}
