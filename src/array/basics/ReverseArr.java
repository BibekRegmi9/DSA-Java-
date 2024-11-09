package array.basics;

import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 9, 12};
        reverseArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverseArr(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void swap(int[] arr , int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
