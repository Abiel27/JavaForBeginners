package Days.Day_2;

public class methodCalling {
    public static void main(String[] args) {
        System.out.println("Message");
        System.out.println("example1");
       // example1("");
        example1();
        //calc(1,2) ---this is not working
        System.out.println(calc(1,2));
        System.out.println(calc(1,2) + calc(1,2));
    }
    public static void example1(){
        System.out.println("Hello World");
    }
    public static int calc(int x, int y) {
        int sum = x + y ;
        return sum;

    }

}
