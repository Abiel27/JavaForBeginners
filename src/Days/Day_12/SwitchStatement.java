package Days.Day_12;

public class SwitchStatement {
    public static void main(String[] args) {
       // String days = "";
        int days = 5 ;


        switch (days){
            case  1:
                System.out.println("Monday");
                System.out.println("Today Spagetti for lunch, but it not yet cooked!");
                break;
            case 2:
                System.out.println("Tue");
                System.out.println("Today is Zgni for lunch, but its not yet prepared");
                break;
            case 3:
                System.out.println("Wed");
                System.out.println("To is Shiro for lunch, at list promissing");
                break;
            case 4:
                System.out.println("Thu");
                System.out.println("Today we shall go out for luch, she happy");
                break;
            case 5:
                System.out.println("Fri");
                System.out.println("Time for having fun, with special deaner or prepare at home");
                break;

            default:
                System.out.println("No worries luch is alreay on the way!");

        }
        System.out.println("no worries, wedi seb bi megbi tiray akonen zinebir, enkelay bi menfes fetari yu,!");
    }
}
