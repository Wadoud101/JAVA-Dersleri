package homework.stringManipulation;

public class C03_Q3 {
    public static void main(String[] args) {

        // a sentences is given and there are some unwanted character in the sentences
        // rid of the number and characters and print the letters.

        String str = "wh2@a%t #a %wo34nde67rf@#ul%l &is^ l%$ea#$rni$#ng";

        System.out.println(str);

        str = str.replaceAll("\\d", ""); // rid of digits
        System.out.println(str);

        str = str.replaceAll("\\s", "1"); // changing spaces to digit
        System.out.println(str);

        str = str.replaceAll("\\W", ""); // rid of all other characters
        System.out.println(str);

        str = str.replaceAll("\\d", " "); // changing digit to space and adding dot.
        System.out.println(str + ".");



    }
}
