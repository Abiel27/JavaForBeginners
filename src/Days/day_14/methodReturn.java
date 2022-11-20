package Days.day_14;

public class methodReturn {
    public static void main(String[] args) {
        String s = returMethod("Rahwit", "  Abiel");
        System.out.println("Me and My Fioncy=  " + s);



    }

        public static String returMethod(String name, String name2) {

            String result;
            result = name + name2;
            return result;


        }
    }
