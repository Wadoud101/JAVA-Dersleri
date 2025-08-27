package subject17;

import java.util.Arrays;

public class C03_OperationsOnArrays {
    public static void main(String[] args) {

        int[][] arr = {{2, 3, 7}, {3, 5}, {4}, {1, 2, 3, 6, 8}};
        System.out.println(Arrays.deepToString(arr));

        int num = 3;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.println("Elemnt: " + i + j + " is: " + arr[i][j]);
                arr[i][j] += num;

            }

        }
        System.out.println();

        System.out.println("After adding " + num + ": " + Arrays.deepToString( arr));


    }
}
