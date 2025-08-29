package homework.week3;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {

         /*9----
    2 farklı String'i  ucuca ekleyen Java Kodunu yazınız.

    Test Data:
    str1: Java is
    str2: fun

    Beklenen Çıktı:
    java is fun

    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first text: ");
        String text1 = scan.nextLine();
        System.out.println("Please enter second text.");
        String text2 = scan.nextLine();

        System.out.println( text1 + " " + text2);
    }
}
