package subject17;

import java.util.Arrays;

public class C02_AddElementToArray {
    public static void main(String[] args) {

        int[] array1 = {4,6,8};

       int[] secArray = addElementToArray(array1, 5);

        System.out.println(Arrays.toString(addElementToArray(secArray,12)));

    }

    public static int[] addElementToArray(int[] arr, int num){

        int[] newArray = new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {

            newArray[i] = arr[i];

        }
        newArray[newArray.length-1] = num;


        return newArray;
    }
}
