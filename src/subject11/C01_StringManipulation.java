package subject11;

public class C01_StringManipulation {
    public static void main(String[] args) {

        // String Manipulation, charAt(), Length

        String str = "Java is Perfect";

        System.out.println("String to Upper Case: " + str.toUpperCase());
        System.out.println("String to lower case: " + str.toLowerCase());
        System.out.println("6th character: " + str.charAt(5));
        System.out.println(str.charAt(str.length()-1));


    }
}
