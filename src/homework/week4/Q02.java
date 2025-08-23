package homework.week4;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {

        /*12----
    Kullanıcının girdiği String değerlerini büyük harfe çeviren Java kodunu yazınız.

    Test Data:
    Java is fun

    Beklenen Sonuç:
    JAVA IS FUN
    */

        Scanner scan = new Scanner(System.in);
        System.out.print("Give an input to change to upercase: ");
        String str = scan.nextLine();
        System.out.println(str.toUpperCase());


    }
}
