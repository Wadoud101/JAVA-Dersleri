package Subject13_MethodCreation;

import java.util.Scanner;

public class C02_Examples {
    public static void main(String[] args) {

        printingBiggerNum(340,65);
        printingBiggerNum(12,12);

        writingTextInReverse("Please");


    }

    public static void printingBiggerNum(int num1, int num2){
        Scanner in = new Scanner(System.in);

        if(num1 > num2){
            System.out.println( num1 + " is BIGGER than " + num2);
        }else if(num1 < num2){
            System.out.println( num2 +  " is BIGGER than " + num1);
        }else System.out.println("Two numbers " + num1 + " are EQUAL");

    }

    public static void writingTextInReverse(String text){

        for (int i = text.length()-1; i >= 0; i--) {
            System.out.print(text.charAt(i));

        }

    }
}
