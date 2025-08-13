package homework.stringManipulation;

import java.util.Scanner;

public class C04_Q4 {
    public static void main(String[] args) {

        // Ask user to enter a password, check it whether it has 10 character, first letter must be small,
        // last character must be number, password must not have spaces.

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter password: ");
        String pass = scan.nextLine();

        int count = 0;

        if(pass.contains(" ")){
            System.out.println("Password must not have SPACES!!");
            count++;
        }

        if(!Character.isLowerCase(pass.charAt(0))){
            System.out.println("First character must be in LOWERCASE!!!");
            count++;
        }

        if(!Character.isDigit(pass.charAt(pass.length()-1) )){
            System.out.println("Last letter must be a DIGIT!!!!");
            count++;
        }

        if(pass.length() < 10){
            System.out.println("Password must have at least 10 characters!!!");
            count++;
        }

        if(count == 0){
            System.out.println("Congratulation,your password is Successfully saved!!!");
        }



    }
}
