package Days.Day_4;

import java.util.ArrayList;

public class printName {
    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();
        names.add("Rob");
        names.add("Bran");
        names.add("Rick");
        names.add("Bran");

        if (names.remove("Bran")){
            names.remove("john");
        }
        System.out.println(names);

    }
}