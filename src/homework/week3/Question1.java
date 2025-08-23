package homework.week3;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {

    /*1---
    Sayinin Sayi degerlerinin toplamasini yapan Java kodu yaziniz.

    Test Data
    34
    Beklenen Cikti
    7
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to calculate the sum of its digits: ");
        int num = scan.nextInt();
        int count = 0;

        for (int i = 0; i <num ; i++) {
            count = num%10;
            num /=10;

        }


        for (int i = 0; i < num; i++) {

        }

    }

}
