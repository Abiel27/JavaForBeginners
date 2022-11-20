package maxandMin_Num;

public class FindMax {
    public static int findMax(int[] nums) {
        int max = Integer.MIN_VALUE;

        for (int each: nums){

            if (each > max){
                max = each;

            }
        }
        return max;


        }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("the bigest num = " + findMax(arr));

    }



}
