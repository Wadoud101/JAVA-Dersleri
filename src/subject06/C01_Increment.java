package subject06;

public class C01_Increment {
    public static void main(String[] args) {

        int num = 10;
        num = num + 3;   // 13

        num += 3;  // 13       except previous operation

        num -= 3;  // 7        except previous operation

        num = 10;
        num++;   // 11         except previous operation
        num--;  // 9           except previous operation


        int num1 = 20;
        num1 *=2;
        System.out.println("Num1 at the 20th row: " + num1);

        num1 -= 5;
        System.out.println("Num1 at the 23rd row " + num1);

        num1 /= 5;
        System.out.println("Num1 at the 23rd row " + num1);

        System.out.println("----------------------");
        // Increment of just 1

        int a = 20;
        int b = 40;

        a++;
        System.out.println("Number a at row 35: " + a);  // 21

        ++a;
        System.out.println("Number a at row 38: "+ a);  // 22

        b--;
        System.out.println("Number b at row 41: "+ b);  // 39

        --b;
        System.out.println("Number b at row 44: "+ b);  // 38

        System.out.println("--------------------");

        a = 20;

        b = a;

        a++;

        System.out.println(" a at the 54. row: " + a + " , b: " + b);   // a = 21,  b = 20

        System.out.println(" ------------------------- ");

        int c = 30;

        c++;

        int d = c;

        System.out.println(" c at the 64. row: " + c + " , d: " + d);   // c = 31,  d = 31

        System.out.println("-------------------------");

        a = 20;
        b = a++;

        System.out.println(" a at the 71. row: " + a + " , b: " + b);   // a = 21,  b = 20    !!!!!!!

        c = 30;
        d = ++c;

        System.out.println(" c at the 76. row: " + c + " , d: " + d);   // c = 31,  d = 31

        System.out.println(" ------------------------------- ");

        a = 20;
        b = 30;

        a++;
        b--;
        System.out.println(" a at the 85. row: " + a + " , b: " + b);   // a = 21,  b = 29

        a = 20;
        b = 30;

        ++a;
        --b;
        System.out.println(" a at the 92. row: " + a + " , b: " + b);   // a = 31,  b = 29



    }

}
