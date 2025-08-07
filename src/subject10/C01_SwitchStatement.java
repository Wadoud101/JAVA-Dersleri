package subject10;

import java.util.Scanner;

public class C01_SwitchStatement {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 1 den 7 ye kadar bir sayi giriniz: ");
        int gunNum = scan.nextInt();

        switch (gunNum){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please Enter a number between 1 to 7");

        }
        System.out.println("============================");

        switch (gunNum) {
            case 1 -> System.out.println("Monday");

            case 2 -> System.out.println("Tuesday");

            case 3 -> System.out.println("Wednesday");

            case 4 -> System.out.println("Thursday");

            case 5 -> System.out.println("Friday");

            case 6 -> System.out.println("Saturday");

            case 7 -> System.out.println("Sunday");

            default -> System.out.println("Please Enter a number between 1 to 7");


            }

        }
}
