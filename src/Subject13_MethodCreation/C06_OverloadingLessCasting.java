package Subject13_MethodCreation;

import org.w3c.dom.ls.LSOutput;

public class C06_OverloadingLessCasting {
    public static void main(String[] args) {
        method1(2,3);
    }

    public static void method1(float a, int b){
        System.out.println("Good");
    }

    public static void method1(double a, double b){
        System.out.println("Bad");
    }

}
