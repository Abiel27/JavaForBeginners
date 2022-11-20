package Days.day_17;

public class StringPractice {
    public static void main(String[] args) {
        String str = "Rahwit";
        String xyz = str.concat(" Abiel");// Rahwit Abiel
        System.out.println("str = " + xyz);

        //-----------------------

        StringBuilder xyzA= new StringBuilder("Abiel");
        StringBuilder concatMeWithRahwit = xyzA.append(" Rahwit");
        System.out.println("concatMeWithRahwit = " + concatMeWithRahwit);

    }
}
