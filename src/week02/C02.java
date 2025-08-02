package week02;

import java.util.Scanner;

public class C02 {

    public static void main(String[] args) {

        // Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

        Scanner in = new Scanner(System.in);
        System.out.println("Lutfen bir harf girin: ");

        char harf2 = (char) in.next().charAt(0);

       // char harf1 = 'a';

        System.out.println((char) (harf2+1) + " " + (char) (harf2+2) + " " + (char) (harf2+3));


    }
}
