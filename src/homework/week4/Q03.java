package homework.week4;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {


    /*13----
    Bir palindrom, madam veya racecar veya 10801 sayısı gibi
    ileriye doğru geriye doğru okuyan bir kelime, sayı, kelime öbeği veya diğer karakter dizisidir.

    Girilecek kelimenin palindrom olup olmadığını doğrulayacak bir Java Kodu yazın.

    Test Data:
    madam

    Beklenen Çıktı:
    True
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("Give a word to check whether if its a palindrome: ");
        String text = scan.nextLine();

        String reverse = "";
        for (int i = text.length()-1; i >= 0 ; i--) {
            reverse += text.charAt(i);

        }
        System.out.println(text.equalsIgnoreCase(reverse));

    }
}
