package Days.day_17;

public class pritmitiveImplicit {
    public static void main(String[] args) {
        short s = 10;
        long l = s;// implicit primitive to large
        System.out.println("l = " + l);

        // explicit from large to small
        int x = 100;
        byte y = (byte) x;
        System.out.println("y = " + y);
        char ch = 'z';

        boolean boo = true;
        System.out.println("boo = " + boo);
    }
}
