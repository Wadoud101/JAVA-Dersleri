package subject12_forLoap;

import java.util.Scanner;

public class C02_Examples {
    public static void main(String[] args) {

        // Print the numbers which 40 is divisible by

        for (int i = 1; i <= 40; i++) {

            if(40%i == 0){
                System.out.print(i + " ");
            }
        }

        // Write the 3 digit numbers are divisible by 37 less than 1000

        System.out.println();
        for (int i = 1000; i > 100; i--) {

            if(i % 37 == 0){
                System.out.print(i + " ");
            }
        }

        // Between the numbers 235 up to 1673 write the amount of the numbers are divisible by 7


        System.out.println();
        int count = 0;
        for (int i = 235; i < 1673; i++) {

            if(i % 7 == 0){
                count++;
            }
        }
        System.out.println("Amount of divisible number between 235 to 1673: " + count);


        // Ask user to enter two number, add all the number between these two number,
        // if the second number is less than first one print an error message

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two number to add all the numbers between these two: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int sum = 0;
        if(num1 < num2){
        for (int i = num1; i < num2; i++) {
           sum += i;
        }
            System.out.println(sum);
        }else System.out.println("First number is bigger than the second one!!!");



    }
}
