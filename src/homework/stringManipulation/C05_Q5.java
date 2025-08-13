package homework.stringManipulation;

import java.util.Scanner;

public class C05_Q5 {
    public static void main(String[] args) {

        // Ask user to enter his name and surname separately
        // if name is longer than the surname print as: Name Surname
        // if name is shorter than the surname print as: SURNAME Name

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.print("Enter surname: ");
        String surname = scan.nextLine();

        String nameChar0 = name.substring(0,1);
        String surnameChar0 = surname.substring(0,1);

        if(name.length() < surname.length()){
            System.out.println(surname.toUpperCase() + " " + nameChar0.toUpperCase() + name.substring(1));
        }

        if(name.length() > surname.length()){
            System.out.println(nameChar0.toUpperCase() + name.substring(1) + " " + surnameChar0.toUpperCase() + surname.substring(1));
        }

        if(name.length() == surname.length()){
            System.out.println(name.toUpperCase() + " " + surname.toUpperCase());
        }

    }
}
