package subject01;

public class C05 {
    public static void main(String[] args) {

        // WRAPPER Clases

        Integer num1 = 50;
        Integer num2 = 34;

        int num3 = num1;
        int num4 = num2;

        String num5 = "45.03";
        String num6 = "3.14";

        double num7 = Double.parseDouble(num5);
        double num8 = Double.parseDouble(num6);

        System.out.println("The sum of two number saved as String is: " + (num7 + num8));

        System.out.println("-----------------------------");
        System.out.println("Maximum Integer number: " + Integer.MAX_VALUE);
        System.out.println("Minimum Integer number: " + Integer.MIN_VALUE);
        System.out.println("------------");
        System.out.println("Shorts Maximum Value: " + Short.MAX_VALUE);
        System.out.println("Shorts Minimum Value: " + Short.MIN_VALUE);
        System.out.println("------------");
        System.out.println("Bytes Maximum Value: " + Byte.MAX_VALUE);
        System.out.println("Bytes Minimum Value: " + Byte.MIN_VALUE);
        System.out.println("--------------------------------");
    }
}
