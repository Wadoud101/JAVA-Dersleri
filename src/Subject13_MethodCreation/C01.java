package Subject13_MethodCreation;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {

        //System.out.println(subStringReturn(4, 8));
        asalSayiMi(69);
    }

    public static String subStringReturn(int ilkHarf, int ikinciHarf){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scan.nextLine();
        String yeniCumle = cumle.substring(ilkHarf,ikinciHarf);
        System.out.println("Girdiginiz cumlenin " + ilkHarf + " ile " + ikinciHarf + " harf araligi harflar : " + yeniCumle);
        return yeniCumle;
    }

    public static void asalSayiMi(int num){


        int sayac = 0;
        for (int i = 2; i < num; i++) {
            if(num%i == 0){
                sayac++;
            }
        }
        if( sayac != 0){
            System.out.println( num + " bir asal sayi DEGILDIR");

        }else System.out.println(num + " asal sayidir");

    }

}
