package homework.deletablePackage;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {

        System.out.println("=============================");
        System.out.println("Welcome to Number Guess Game!");
        System.out.println("=============================");

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int randomNum = random.nextInt(1,100);
        int attempt = 0;
        int guess;

        do {
            System.out.print("Please enter a number between 1 to 100: ");
            guess = in.nextInt();
            attempt++;

            if(guess < randomNum){
                System.out.println("TOO Low!!!");
            } else if (guess > randomNum) {
                System.out.println("TOO BIG!!!");

            }else {
                System.out.println("You WIN!!!");
                System.out.println("The number is: " + randomNum);
                System.out.println("After " + attempt + " attempts.");
            }


        }while (randomNum != guess );



    }
}
