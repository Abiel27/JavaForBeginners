package Days.Day_11;

public class UnaryINcrementDecrement {
    public static void main(String[] args) {
        int abiel = 100;
        int rahwa = 25;
        int a = 1;
        //abiel = abiel+1;
        //using the same valiable
        System.out.println(++abiel);//101
        System.out.println(--abiel);//100

        // post increment and post decrement
        System.out.println("rahwa = " + rahwa++);//25
        System.out.println("rahwa = " + rahwa--);//26
        //out put for a?????
        a = -a-- + a++ / -a-- * --a;
        System.out.println("a = " + a);

    }

}
