package subject05;

import javax.sound.midi.Soundbank;

public class C01_WrapperClasses {
    public static void main(String[] args) {

        String str = "Java is life!!! ";
        int num = 34;

        System.out.println(str.toUpperCase()); // JAVA IS LIFE
        System.out.println(str.charAt(2)); // v

        int num1 = 5;
        Integer num2 = num1;

        Integer num3 = 3456;
        int num4 = num3;

        // For Primitive Data in Java there some Wrapper class which we use
        // boolean, char,      byte, short, int,     long, float, double
        // Boolean, Character, Byte, Short, Integer, Long, Float, Double
        // in primitive variables same data types can be assigned to each other

        int num5 = 25;
        short num6 = 45;
        byte num7 = 23;

        int num8 = num6;  // int <== short
        num6 = num7;     // short <== byte

        Short num9 = 45;
        // Integer num10 = num9; // Integer <== Short  X


        String price1 = "23"; // Price is given in String
        String price2 = "45";

        System.out.println( price1 + price2 ); //2345

        int prc1 = Integer.parseInt(price1);
        int prc2 = Integer.valueOf(price2);

        System.out.println("Total price: " + (prc1+prc2)); // 68

        price1 = "23.45";
        price2 = "34.43";

        double p1 = Double.parseDouble(price1);
        double p2 = Double.valueOf(price2);

        System.out.println("The sum of two Double in String is: " + (p1+p2)); // 57.879999999999995

        System.out.println("------------------------------");
//        price1 = "23a";
//        price2 = "34";
//
//        p1 = Double.parseDouble(price1);
//        p2 = Double.valueOf(price2);
//
//        System.out.println("The sum of two Double in String is: " + (p1+p2)); // .NumberFormatException: For input string: "23a"

        System.out.println(" ----------------------------------- ");

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        System.out.println("----------------------------------");

        // Show that the given character is in capital letter.

        char ltr = 's';
        System.out.println(Character.isUpperCase(ltr));  // false
        System.out.println(Character.isAlphabetic(ltr));
        System.out.println(Character.isLetter(ltr));
        System.out.println(Character.isLowerCase(ltr));

        System.out.println(Character.toUpperCase(ltr));

    }
}
