package week02;

import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {

        //        Soru 5- Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun ve bolum isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir double syi giriniz: ");
        double num1 = scan.nextDouble();
        System.out.println("Lutfen bir tamsayi giriniz: ");
        int num2 = scan.nextInt();

        System.out.println( (int) (num1 / num2));


    }
}
