package array.basics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArrBy1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};st

        rotate(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] arr){

        int lastElement = arr[arr.length-1];
        for(int i = arr.length-2; i >= 0; i--){
            arr[i+1] = arr[i];

        }
        arr[0] = lastElement;
    }
}
