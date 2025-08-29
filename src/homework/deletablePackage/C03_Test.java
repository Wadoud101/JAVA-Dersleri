package homework.deletablePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_Test {
    public static void main(String[] args) {

        List<String> verilenListe =  new ArrayList<>(Arrays.asList("Ahet", "Ali", "Munir", "Leyla", "Ghulam"));
        String verilenHarf = "e";
        String verilenHarf1 = "a";

        System.out.println(kelimedeOlanHarfiSilen(verilenListe, verilenHarf));
        System.out.println(kelimedeOlanHarfiSilen(verilenListe, verilenHarf1));

    }

    public static List<String> kelimedeOlanHarfiSilen (List<String > list1, String harf){

        for (int i = 0; i < list1.size(); i++) {

           String ltr = list1.get(i).toString();
           i--;

           if (ltr.contains(harf)){
               list1.remove(i);
           }

        }

        return list1;
    }
}
