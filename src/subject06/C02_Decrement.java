package subject06;

public class C02_Decrement {
    public static void main(String[] args) {

        int a = 20;
        System.out.println(a++);  // 20
        System.out.println(a);   // 21

        a = 20;
        System.out.println(++a);  // 21

        System.out.println("--------------------------");

        int b= 30;
        a = b++;
        System.out.println("Value of a at row 14: " + a + " , b: " + b);

        b = 30;
        a = ++b;
        System.out.println("Value of a at row 14: " + a + " , b: " + b);

        System.out.println("--------------------------");

        b= 30;
        double d = ((b++) / 2);
        System.out.println("Value of d at row 14: " + d + " , b: " + b);
        System.out.println(d);

        b = 30;
        d = (++b / 2);
        System.out.println("Value of d at row 14: " + d + " , b: " + b);
        System.out.println(d);
        d=((double) b/2);
        System.out.println(d);







    }
}
