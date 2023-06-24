package Util;

public class combineTwoArrays {
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
