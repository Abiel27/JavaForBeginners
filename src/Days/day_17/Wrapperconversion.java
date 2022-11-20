package Days.day_17;

public class Wrapperconversion {
    public static void main(String[] args) {
        String str = "2145";
        //wrapper unboxing
        int myNumber = Integer.parseInt(str);
        System.out.println("myNumber = " + myNumber);
        // Wrapper class to object
        Integer num2 = Integer.valueOf(str);
        System.out.println("num2 = " + num2);

        String str2 = "234.234";

        Double myDouble = Double.valueOf(str2);
        System.out.println("myDouble = " + myDouble);


        short x = 10;
        byte y = (byte) x;
        System.out.println("y = " + y);


    }
}
