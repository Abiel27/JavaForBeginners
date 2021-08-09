package Day_3;

public class ifElseStatement {
    public static void main(String[] args) {
        String x = "M A M A T";
        int c = x.charAt(8);
        if (c == 'z') {
            System.out.println("A");
        }else if(c=='M') {
            System.out.println("Mhira");
        }else if (c=='A'){
            System.out.println("Almi");

        }else if (c== 'T'){
            System.out.println("Tekish");


        }else {
            System.out.println("Aboy");
        }



    }
}