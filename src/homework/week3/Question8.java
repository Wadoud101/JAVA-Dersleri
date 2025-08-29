package homework.week3;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {

           /*8----
     Girilen String değerde tersten yazan Java kodunu yazınız.

    Test Data:
    java
    avaj
    */

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a text to write it in REVERSE: ");
        String text = scan.nextLine();

        for (int i = text.length()-1; i >= 0; i--) {
            System.out.print(text.charAt(i));

        }

    }
}
