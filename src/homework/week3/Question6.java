package homework.week3;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {

           /*6----
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
    1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!

    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a letter: ");
        String text1 = scan.nextLine();
        String text = text1.toLowerCase();
        char letter = text.charAt(0);

        if (((letter >= 'A' && letter<= 'Z') || (letter >= 'a' && letter<= 'z')) && text.length() == 1){

            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                System.out.println(text1 + " harfi sesli harfdir.");
            } else System.out.println(text1 +  " harfi sesli harf degildir.");

        } else System.out.println("Please enter a letter!!!");

    }
}
