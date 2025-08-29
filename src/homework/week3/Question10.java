package homework.week3;

import java.util.Locale;
import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {

          /*10-----
    Kullanıcıdan alınan String kümesi içerisinde aranan String i bulan Java Kodunu yazınız.

    Test Data:
    Java is easy

    Aranan String: is

    Bektenen Çıktı:
    True

    Aranan String: and

    Beklenen Çıktı:False

    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the text: ");
        String text1 = scan.nextLine().toLowerCase();
        System.out.print("Please enter the word you want to look for: ");
        String text2 = scan.nextLine().toLowerCase();

        if (text1.contains(text2)){
            System.out.println("True");
        } else System.out.println("False");
    }
}
