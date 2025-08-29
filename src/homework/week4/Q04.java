package homework.week4;

public class Q04 {
    public static void main(String[] args) {

        int[] sayilar = {5,6,7,67,5,78,8,3,9};

        int sum = 0;
        for (int i = 0; i < sayilar.length; i++) {

            sum += sayilar[i];

        }
        System.out.println(sum);

        int smallestNum = sayilar[0];
        for (int i = 0; i < sayilar.length; i++) {
            if (smallestNum > sayilar[i]){
                smallestNum = sayilar[i];
            }
        }
        System.out.println(smallestNum);





    }
}
