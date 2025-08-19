package homework.deletablePackage;

import java.util.Scanner;

public class C02_BankingProgram {

    static Scanner scan = new Scanner(System.in);
    static double balance = 0.00;

    public static void main(String[] args) {

        System.out.println("===========================");
        System.out.println("Welcome to Banking Program.");
        System.out.println("===========================");


        boolean isRunning = true;
        int choice;

        while (isRunning){

            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("Please Enter your Choice: ");
            choice = scan.nextInt();


            switch (choice){
                case 1 -> balance(balance);
                case 2 -> deposit();
                case 3 -> withdrawal();
                case 4 -> isRunning = false;
                default -> System.out.println("Enter Correct Choice!!!");
            }
        }
        System.out.println("Thanks for your business with us!!");
        System.out.println("***********************************");
    }

    static void balance(Double balance){
        System.err.println("Your Balance is: $" + balance);
        System.out.println("=============================");
    }

    static void deposit(){
        System.out.print("Please enter the amount you want to DEPOSIT: ");
        double depositAmount = scan.nextDouble();

        if (depositAmount < 0 ){
            System.out.println("Deposit amount must be Positive.");
        }else {
            balance += depositAmount;
            System.err.println("You deposited $" + depositAmount + " now your balance is: $" + balance);
            System.out.println("======================================");
        }
    }

    static void withdrawal(){
        System.out.print("How much do you want to Withdraw: ");
        double withdrawAmount = scan.nextDouble();

        if(withdrawAmount > balance) {
            System.out.println("INSUFFICIENT Balance");
        } else if (withdrawAmount < 0) {
            System.out.println("Withdrawal amount cant be negative");

        }else {
            balance -= withdrawAmount;
            System.err.println("After Withdraw of $" + withdrawAmount + " Your Balance is: $" + balance);
        }

    }

}
