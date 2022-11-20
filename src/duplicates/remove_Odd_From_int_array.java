package duplicates;

public class remove_Odd_From_int_array {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,3};

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i%2 != 0){
                count++;
                System.out.println("i = " + i);

            }

        }
        System.out.println("collector = " + count);
    }

}
