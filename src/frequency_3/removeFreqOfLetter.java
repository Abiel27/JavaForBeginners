package frequency_3;

public class removeFreqOfLetter {
    public static void main(String[] args) {
        String str = "abababab";
        char ch = str.charAt(0);

        int count = 0;
        while (str.contains(ch + "")) {
            str = str.replaceFirst(ch + "", " ");
            count++;

        }
        System.out.println(count);
    }
}
