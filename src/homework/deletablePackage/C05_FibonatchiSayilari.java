package homework.deletablePackage;

import java.util.ArrayList;
import java.util.List;

public class C05_FibonatchiSayilari {
    public static void main(String[] args) {

    }

    public static List<Integer> fibonatciNum(int num){

        List<Integer> numbers = new ArrayList<>();
        int num1 = 1;
        int num2 = 0;

        for (int i = 1; i < num; i++) {

            num2 = num1 + i;
            i = num2;

        }
        return numbers;
    }
}
