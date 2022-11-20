package Days.day_14;


public class NewMethods {



    public void sum (int x, int y, int z){
//        System.out.println("sum is = " +( x + y+ z));
        int tSum = x + z+y;
        System.out.println(tSum);

    }

    public static void main(String[] args) {
        NewMethods xx = new NewMethods();
        xx.sum(1,2,3);
    }
}
