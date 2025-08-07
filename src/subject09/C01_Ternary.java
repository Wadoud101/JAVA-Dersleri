package subject09;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {

        int a = 5;

        a = a>0 ? a*2 : a+10;

        System.out.println(a);

        // Kullanicidan bir sayi isteyin, 500 den buyukse rakamlar toplamini yazdirin, degilse onlar basamaginin karesini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 3 basamakli bir sayi giriniz: ");
        int num = scan.nextInt();

        int sumofDigit =0 ;
        int newNum = 0;
        if(num>500){
            sumofDigit += num %10;
            num /= 10;
            sumofDigit += num%10;
            num /= 10;
            sumofDigit +=num;
            System.out.println("Sum of Digits: " + sumofDigit);

        }else {

            newNum =num / 10;
            int ikinciBasamak = newNum %10;
            System.out.println("Ikinci basamak karesi: " + ikinciBasamak * ikinciBasamak);


        }




    }
}
