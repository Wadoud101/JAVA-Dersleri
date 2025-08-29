package homework.week3;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {

         /*7-----
    Ugly Number:

    Girilen bir sayının  ugly number olup olmadığını kontrol etmek için bir Java programı yazın.


    Sayı sisteminde,  ugly number  sadece asal faktörleri carpanlari 2, 3 veya 5 olan pozitif sayılardan olusur...
    İlk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.

    Test Data:
    13

    Beklenen çıktı:
    ugly number  degildir

    Test Data:
    25
    Beklenen Çıktı:

    ugly number

    */
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Give a number to check whether is ti UGLY number or not: " +
                    "\nor enter 0 to exit! ");
            int num = scan.nextInt();
            if ( num == 0){
                break;
            }

            if (num % 2 == 0 || num % 3 == 0 || num%5 == 0){
                System.err.println(num + " is an UGLY number!!!");
            } else System.err.println(num + " is NOT an ugly number!");


        }

    }
}
