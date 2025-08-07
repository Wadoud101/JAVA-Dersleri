package subject08_ifElseStatement.lesson02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {

        /*
        Kullanicidan cinsiyet ve yasini alin, kadin, 60 yas ve uzeri, Erkek 65 yas ve uzeri
        emekli olabilir. veya "Emekli olmak icin ... yil daha calisman gerekir" yazdirin.
        Kullanici E ve K disinda bir cinsiyet girerse ve ya 15 yasdan kucuk, 80 yasdan buyuk
        girerse uyarin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Cinsiyetinizi giriniz: E: Erkek, K: Kadin.");
        char cinsiyet = scan.next().toUpperCase().charAt(0);

        System.out.println("Lutfen Yasinizi giriniz: ");
        double yas = scan.nextDouble();

        if(yas<15 || yas > 80 || !(cinsiyet == 'E' || cinsiyet == 'K')){
            System.out.println("Girilen degerleri gozden gecirin!!!");

        } else if (cinsiyet== 'K' && yas>60) {
            System.out.println("Kadin ve Emekli olabilirsin ...");

        } else if (cinsiyet=='E' && yas>65) {
            System.out.println("Erkek ve Emekli olabilirsi ...");

        }


    }
}
