package nNumbersToStringLooped_2;

public class NumbersToStringToConssole {
    public static void main(String[] args) {
        int num = 997973245;
        //take it to string to print individually
        String singleNum = "" + num;

        for (int i =0, j=1; i<=singleNum.length()-1; i++, j++){
            System.out.println(" Digit " +j+ ": " + singleNum.charAt(i) );

        }
    }
}