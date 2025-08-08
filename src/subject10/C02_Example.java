package subject10;

import java.util.Scanner;

public class C02_Example {
    public static void main(String[] args) {


        // Get a two-digit number from User, and write it in words

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a two digit number: ");
        int num = scan.nextInt();

        int unitDigit = num%10;
        int tenthDigit = num/10;

        if (num > 0 && num < 100) {
            System.out.print("You entered: ");

            switch (tenthDigit) {
                case 0 -> System.err.print("");
                case 1 -> System.err.print("1");      //Will work on it later
                case 2 -> System.err.print("twenty");
                case 3 -> System.err.print("thirty");
                case 4 -> System.err.print("forty");
                case 5 -> System.err.print("fifty");
                case 6 -> System.err.print("sixty");
                case 7 -> System.err.print("seventy");
                case 8 -> System.err.print("eighty");
                case 9 -> System.err.print("ninety");

            }
            System.err.print("-");

            switch (unitDigit) {
                case 0 -> System.err.print(" ");
                case 1 -> System.err.print("one");
                case 2 -> System.err.print("two");
                case 3 -> System.err.print("three");
                case 4 -> System.err.print("four");
                case 5 -> System.err.print("five");
                case 6 -> System.err.print("six");
                case 7 -> System.err.print("seven");
                case 8 -> System.err.print("eight");
                case 9 -> System.err.print("nine");
            }
        }else System.out.println("Enter a positive two digit number!!!");


    }
}
