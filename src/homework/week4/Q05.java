package homework.week4;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {

        /*15----
    Grilen String değer içinde istenen sıradaki karakteri bulan Java kodunu yazınız.

    Test Data:
    Java is fun


    Beklenen Çıktı
    0. pozisyondaki karakter : J

    5. pozisyondaki karakter : i
    */

        Scanner scan = new Scanner(System.in);
        System.out.print("Give a text: ");
        String str = scan.nextLine();
        System.out.print("Which letters Index do you want to search: ");
        int str2 = scan.nextInt();

        System.out.println(str2 + ". letter is: " + str.charAt(str2));


    }


}
