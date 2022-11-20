package palindrom;

public class isPalin {
    //using for loop
    static boolean isPalindromeword(String str) {

       for( int i = 0, j = str.length() - 1; i<j;i++,j--){
           if(str.charAt(i) != str.charAt(j))
               return false;
       }
       return true;

    }
    public static void main(String[] args) {
        String st ="addaw";
        if(isPalindromeword(st))
            System.out.println("yes");
        else
            System.out.println("No" );
    }

}

