package subject05;

import java.util.Scanner;

public class C02_MathematicalOperations {
    public static void main(String[] args) {

        System.out.println( 25 / 10 );  // 2.5 ==> 2
        System.out.println( 25 / 4 ); // 3.75 ==> 3

        // Modules
        System.out.println( 34 % 5 ); // 4

        // request user to enter a number
        // print the unit of the number

        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter a number: ");
        int num = in.nextInt();
        System.out.println("Unit digit of the number is: " + (num % 10));

        // request user to enter a number
        // add the digits of the entered number.


        System.out.println("Please Enter a 3 digit number: ");
        int num1 = in.nextInt();
        System.out.println("Unit digit of the number is: " + (num1 % 10) + (num1 % 100) + (num1 % 10));


    }
}
