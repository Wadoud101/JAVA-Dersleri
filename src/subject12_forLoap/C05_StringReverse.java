package subject12_forLoap;

import java.util.Scanner;

public class C05_StringReverse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a text to write it in REVERSE: ");
        String text = scan.nextLine();

        for (int i = text.length()-1; i >= 0 ; i--) {
            System.out.print( text.charAt(i));

        }


    }
}
