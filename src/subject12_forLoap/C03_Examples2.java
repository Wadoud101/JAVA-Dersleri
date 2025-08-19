package subject12_forLoap;

import java.util.Scanner;

public class C03_Examples2 {
    public static void main(String[] args) {

        // Ask user to enter a number to find its factorial.

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial less than 17: ");
        int num = scan.nextInt();
        int total = 1;

        System.out.print(num + "! = ");
        for (int i = num; i > 1; i--){
            System.out.print( i + " * ");

            total *= i;
        }
        System.out.println("1 = " + total);

        System.out.println("===============================");

        // Ask user to enter a number and find the sum of its digits

        System.out.print("Enter a number to calculate sum of its digits: ");
        int num2 = scan.nextInt();
        int newNum = num2;
        int numDigits = (num2 + "").length();
        int sum = 0;

        System.out.println("Entered Number: " + num2);
        for (int i = 0; i < numDigits; i++) {
            int digit = newNum%10;
            newNum = newNum/10;
            sum += digit;
            System.out.print(digit + ", ");

        }
        System.out.println();
        System.out.println("Sum of the digits of " + num2 + " are: " + sum);




    }
}
