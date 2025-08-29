package homework.deletablePackage;

import java.util.ArrayList;
import java.util.List;

public class C04_TamSayiBolen {
    public static void main(String[] args) {
        System.out.println(tamBolenListesi(20));

    }

    public static List<Integer> tamBolenListesi(Integer num){

        List<Integer> resultList = new ArrayList<>();



        for (int i = 2; i <= num; i++) {

            if (num % i == 0){
                resultList.add(i);
            }


        }
        return resultList;


    }
}
