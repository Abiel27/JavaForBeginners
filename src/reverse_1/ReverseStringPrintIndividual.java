package reverse_1;

public class ReverseStringPrintIndividual {
    public static void main(String[] args) {
        String word = "meningitis";




        for (int i = word.length()-1; i>=0; i--){

            System.out.println("letter = " + word.charAt(i));

        }

    }
}

