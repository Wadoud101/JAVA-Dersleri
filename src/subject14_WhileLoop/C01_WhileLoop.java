package subject14_WhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {

        // Sum of 1 - 10

        int sum =0;
        for (int i = 1; i <= 10 ; i++) {

            sum += i;
        }
        System.out.println("Sum of 1 - 10 in While loop: " + sum);

        int num = 1;
        sum = 0;

        while (num <= 10){
            sum += num;
            num++;
        }
        System.out.println("Sum of 1 - 10 in For loop: " + sum);


        int mult = 1;
        // Multiplying of even number between 20 t0 30
        for (int i = 20; i <= 30; i++) {
            if(i % 2 == 0){
                mult *= i;
            }
        }
        System.out.println("Multiplying of even numbers between 20 to 30 in FOR loop: " + mult);

        mult = 1;
        num = 20;

        while (num <=30){
            if( num % 2 == 0 ){
                mult *= num;

            }
            num++;
        }
        System.out.println("Multiplying of even numbers between 20 to 30 in WHILE loop: " + mult);

    }
}
