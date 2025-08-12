package homework.week3;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {

        // Ask user to enter his name, surname and his credit card number
        // print the info as:  N*** S******
        // card number as :    **** **** **** 4567

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scan.nextLine();

        System.out.print("Please enter your surname: ");
        String surname = scan.nextLine();

        System.out.print("Please enter your 16 number Credit Card no: ");
        String ccNo = scan.nextLine();

        System.out.println(

                "Name and Surname: " + name.substring(0,1).toUpperCase() + name.substring(1).replaceAll("\\w","*")
                        + " " + surname.substring(0,1).toUpperCase()+surname.substring(1).replaceAll("\\w","*") + ",\n"
                        + "Your Credit Card No is: " + "**** **** **** " + ccNo.substring(ccNo.length()-4)

        );

        System.out.println(

               // "Your Credit Card No is: " + ccNo.substring(0,13).replaceAll("\\d","*") + ccNo.substring(ccNo.length()-4)

        );
     

    }
}
