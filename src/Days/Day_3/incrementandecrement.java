package Days.Day_3;

public class incrementandecrement {
    public static void main(String[] args) {


        int x = 5;
        do {
            x = x++ + --x - (x % 3);
        }
        while (++x < 4);
        System.out.println("Abiel");
    }
}

