package Days.day_8;

import java.util.Arrays;

public class ADDINGtWOaRRAYS {
    public static void main(String[] args) {
        int[] yyy = {1,2,3,4};
        int[] bbb = {4,5,6,7,};
        int[] kederensa =combineTwoArrays(yyy,bbb);
        System.out.println("Arrays.toString(kederensa) = " + Arrays.toString(kederensa));

    }
    public static int[] combineTwoArrays(int[] abi, int[] rahwit){
       int[] abiRahwit = new int[abi.length+rahwit.length];
        int i = 0;

        for(int each : abi){
      abiRahwit[i++] = each;//  1 2 3 90 1  i++ , i-- ->
                               //  0 1 2 3 4

        }

        for(int each : rahwit){
            abiRahwit[i++]  = each;
        }

        return abiRahwit;
    }


}
