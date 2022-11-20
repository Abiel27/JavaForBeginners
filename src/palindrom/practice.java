package palindrom;

public class practice
{
    public static void main(String[] args) {
        String str = "my name is Gardian";


        StringBuilder reve = new StringBuilder();
        for (int i = str.length()-1; i >=0; i--) {
            reve.append(str.charAt(i));

        }
        System.out.println("reve = " + reve);
    }
}
