package subject05;

public class C03_Concatenations {
    public static void main(String[] args) {

        String a = "Hello";
        String b = "World";
        System.out.println( a + b );  // HelloWorld
        System.out.println( a + " " + b);  // Hello World

        String c = "Hello";
        int d = 2;
        int e = 3;

        System.out.println( c + d + e );  // Hello23
        System.out.println( e + d + c );  // 5Hello
        System.out.println( c + (d + e)); // Hello5
        System.out.println( c + d * e );  // Hello6

        System.out.println( 3 + 4 );     // 7
        System.out.println( 3 + "" + 4); // 34

        String str = "a";
        System.out.println( str + 5);   //a5
//        System.out.println( str - 5); // Operator '-' cannot be applied to String
//        System.out.println( str * 5); // Operator '*' cannot be applied to String
//        System.out.println( str / 5); // Operator '/' cannot be applied to String


    }
}
