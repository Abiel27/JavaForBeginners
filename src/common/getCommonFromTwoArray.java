package common;

public class getCommonFromTwoArray {
    public static void main(String[] args) {
        // get the common or intersection numbers
        int[] arr1 = {1, 2, 3, 4, 5, 6,};
        int[] arr2 = {1, 2, 3, 7, 8, 9, 56};

        for (int i = 0; i <= arr1.length-1; i++) {
            int num = arr1[i];

            for (int j = 0; j <= arr2.length-1; j++) {
                if (num == arr2[j]) {
                    System.out.println(num);
                    break;
                }

            }

        }

    }
}
