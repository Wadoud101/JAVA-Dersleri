package homework.deletablePackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_Practice {
    public static void main(String[] args) {


        System.out.println(nameList());

    }

    public static List<String> nameList (){
        Scanner scan = new Scanner(System.in);

        List<String> name = new ArrayList<>();
        while (true){
            System.out.println("Give a name: " +
                    "\nor Q for exit: ");
            String name1 = scan.nextLine();
            if (name1.equalsIgnoreCase("q")){
                break;
            }
            name.add(name1);

        }

        return name;
    }
}
