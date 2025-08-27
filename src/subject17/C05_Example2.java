package subject17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_Example2 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Ali", "Veli", "Mahmood", "Shahbaz"));


        for (int i = 0; i < names.size(); i++) {

            if( names.get(i).contains("e")){
             names.remove(names.get(i));
             i--;
            }

        }

        System.out.println(names);

    }
}
