package week02;

import java.util.Scanner;

public class C06_LiveLesson {
    public static void main(String[] args) {

        /*
        // kullanicidan 2 tam sayi alin
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 tamsayi giriniz...");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk" yazdirin
        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk" yazdirin
        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk" yazdirin
        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati" yazdirin
         */

        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter two number: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        if ( num1 < num2 ){
            System.out.println("Number1 is less than Number 2");
        }

        if(num1 > 0){
            System.out.println("Number 1 is a positive number.");
        }

        if(num2 > 50){
            System.out.println("Number 2 is bigger than 50");
        }

        if(num2 %5 ==0){
            System.out.println("Second numnber is divisible by 5 ");

        }
    }
}
