package subject12_forLoap;

import java.util.Scanner;

public class C04_PrimeNumbers {
    public static void main(String[] args) {

        // Ask user to enter a number, check it whether it is Prime or not

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = scan.nextInt();
        int count = 0;

        for (int i = 2; i < num; i++) {
            if(num % i == 0){
            count++;
            }

        }

        if(count == 0){
            System.out.println(num + " is a Prime number");
        }else System.out.println(num + " is NOT a prime number.");
    }
}
