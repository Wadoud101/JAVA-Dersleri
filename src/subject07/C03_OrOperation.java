package subject07;

public class C03_OrOperation {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        boolean c;

        System.out.println(a>b || b>0);
        System.out.println(a<=b-5 || a>b-8);
        System.out.println(c=15>=b || a<0);
        c = a>=b || 3*a<4*b;
        System.out.println(c);

        System.out.println("------------------");

        char givenLetter = 't';
        System.out.println( givenLetter >= 'a' && givenLetter <= 'z');
        System.out.println( givenLetter >= 'a' && givenLetter <= 'k');

        int givenNum = 25;
        System.out.println(givenNum >= 10 && givenNum <=99);
        System.out.println(givenNum >= 100 && givenNum <=200);

    }
}
