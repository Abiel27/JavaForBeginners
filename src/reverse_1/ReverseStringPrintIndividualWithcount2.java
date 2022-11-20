package reverse_1;

public class ReverseStringPrintIndividualWithcount2 {
    public static void main(String[] args) {
        String word = "menghistu";



        for (int i = word.length()-1, j=0; i>=0; i--,j++){

            // start counting from 1 by adding 1 to j (j+1)

            System.out.println((1+ j)+" = " + word.charAt(i));

        }

    }
}

