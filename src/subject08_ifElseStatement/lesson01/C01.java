package subject08_ifElseStatement.lesson01;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Mark: ");
        double mark = scan.nextDouble();

        if(mark > 50) {
            System.out.println("You PASSED");
        }

    }
}
