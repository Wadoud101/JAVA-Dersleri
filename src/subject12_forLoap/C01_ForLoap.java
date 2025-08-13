package subject12_forLoap;

public class C01_ForLoap {
    public static void main(String[] args) {

        for(int i=1; i<=50; i=i+2){
            System.out.print(i + ", ");
        }
        System.out.println();
        for (int i = 207; i < 400; i=i+5) {
            System.out.print(i + " ");

        }
        System.out.println();

        int sum = 0;
        for (int i = 10; i < 100; i++) {

            if(i%2==0){
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println();
        System.out.println("sum of two digit even numbers: "  + sum);
    }
}
