package Subject13_MethodCreation;

public class C05_OverLoading {
    public static void main(String[] args) {

        // Method Overloading
        // auto-widening

        sum(5);

        sum(2.3, 5);

        sum(2.4, 'a');

    }

    public static void sum(int num1){
        System.out.println("int " + (num1 + num1));
    }
    public static void sum(int num1, int num2){
        System.out.println("int int " + (num1 + num2));
    }
    public static void sum(float num1, int num2){
        System.out.println("float int " + (num1 + num2));
    }
    public static void sum(double num1, int num2){
        System.out.println("double int " + (num1 + num2));
    }
    public static void sum(double num1, double num2){
        System.out.println("double double " + (num1 + num2));
    }
}
