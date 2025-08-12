package homework.stringManipulation;

public class C02_Q2 {
    public static void main(String[] args) {

        // add these two value which is given as String
        String input1 = "$15.30";
        String input2 = "$11.40";     // output must be $26.70

        String currency = String.valueOf(input1.charAt(0));

        input1 = input1.replaceAll("\\W","");
        input2 = input2.replaceAll("\\W","");



        double input11 = Double.parseDouble(input1)/100;
        double input21 = Double.parseDouble(input2)/100;

        double sum = input11 + input21;
       

        System.out.println("The sum of two input is: " + currency + sum);


        // add these two value which is given as String
        input1 = "15.30";
        input2 = "11.40";     // output must be $26.70

        double input3 = Double.parseDouble(input1);
        double input4 = Double.parseDouble(input2);

        System.out.println("The sum of two input is: " + "$" + (input3 + input4));

    }
}
