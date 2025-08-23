package homework.week4;


import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

    /*11----
    Kullanıcıdan alınan Stringin son karakteirini silip ekrana yazan Java kodunu yazınız.

    Test Data:
    good

    Beklenen Çıktı:
    goo
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a word: ");
        String str = scan.nextLine();

        str = str.substring(0, str.length()-1);

        System.out.println(str);

    }

}