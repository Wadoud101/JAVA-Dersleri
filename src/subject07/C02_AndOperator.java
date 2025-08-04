package subject07;

public class C02_AndOperator {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        boolean c;

        System.out.println(a>b && b>0);
        System.out.println(a<=b-5 && a>b-8);
        System.out.println(c=15>=b && a<0);
        c= a>=b && 3*a<4*b;
        System.out.println(c);

        System.out.println("-----------------------------------");

        a = 10;
        b = 15;

        System.out.println(a<b && b<10 && b>=a && a<0); // this operation compute until first false,
        System.out.println(a<b  & b<10  & b>=a  & a<0); // this operation compute all the operation in the equation.

        System.out.println("--------------------------");


        boolean result1 = true;
        boolean result2 = true;
        boolean result3 = true;

        boolean result4 = (result1 = a>=b) & (result2 = a<b) & (result3 = a>b-8);

        System.out.println(result4);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        boolean result5 = true;
        boolean result6 = true;
        boolean result7 = true;

        boolean result8 = (result5 = a>=b) && (result6 = a<b) && (result8 = a>b-8);

        System.out.println(result8);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);


    }
}
