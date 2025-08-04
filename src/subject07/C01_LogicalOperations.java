package subject07;

public class C01_LogicalOperations {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        System.out.println(a==b);  // false
        System.out.println(a==b-5); // true
        boolean c;
        System.out.println(c=15==b); // true
        c = 15 * a == 10 * b;
        System.out.println(c);  // true

//        !ture ==> false;
//        !(5==5) ==> false
//        5 != 5 ==> false

        System.out.println("----------------------------");

        a = 5;
        b = 8;
        int d = 3;

        System.out.println( a == b );       // 5==8  ==> false
        System.out.println( b == b+d );     //
        System.out.println( b > d );        //
        System.out.println( d > a );        //
        System.out.println( a = b );        //
        System.out.println( d = a-b );      //
        System.out.println( a != d );       //
        System.out.println( a != b );       //
        System.out.println( a >= b );       //

        System.out.println("--------------------");

        System.out.println( 'a' <= 'd' );
        System.out.println( 'a' == 'a' );
        System.out.println( 'b' != 'b' );
        System.out.println( 'd' != 'e' );

        System.out.println("==========================");

        String s1 = "Ali";
        String s2 = "Ali";
        String s3 = "A" + "l" + "i";
        String s4 = "A";
        String s5 = "li";
        String s6 = s4 + s5;
        String s7 = new String("Ali");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s6);
        System.out.println(s1 == s7);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s6));
        System.out.println(s1.equals(s7));

        System.out.println(s1.equals("ali"));
        System.out.println(s1.equals("ALI"));
        System.out.println(s1.equals("Ali "));


    }
}
