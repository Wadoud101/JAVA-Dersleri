package week02;

import java.util.Scanner;

public class C03 {

    public static void main(String[] args) {

//        Soru 3- Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128 ile 127 arasindaki bir sayiya donusturup yazdirin.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        int num1 = scan.nextInt();

        System.out.println((byte) num1);


    }
}
