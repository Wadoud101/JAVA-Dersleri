package subject17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_Examples {
    public static void main(String[] args) {
        System.out.println(nameList());
    }

    public static List<String> nameList(){

        Scanner input = new Scanner(System.in);

        List<String> nameList1 = new ArrayList<>();
        String name = "";

        do {

            System.out.println("Please enter a name to add to the list: " +
                    "\nor q for quit!");
            name = input.nextLine();

            if(!name.equalsIgnoreCase("q")){
                nameList1.add(name);
            }



        }while ( !name.equalsIgnoreCase("q"));


        return nameList1;
    }
}
