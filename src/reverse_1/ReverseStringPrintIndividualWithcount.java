package reverse_1;

public class ReverseStringPrintIndividualWithcount {
    public static void main(String[] args) {
        String word = "12345678";

        int i, j = 1;

        for (i = word.length()-1; i>=0; i--,j++){

            System.out.println(j+" = " + word.charAt(i));

        }

    }
}

