package subject02;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {

        //        Soru 4- Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki double syi giriniz: ");
        double num1 = scan.nextDouble();;
        double num2 = scan.nextDouble();
        System.out.println( (int) (num1 / num2) );


    }
}
