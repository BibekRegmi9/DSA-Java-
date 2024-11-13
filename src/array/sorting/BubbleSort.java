package array.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr){
        for(int i = arr.length-2; i >= 0; i--){
            for(int j = 0; j <= i; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j , j+1);
                    System.out.println("J = " + j + " and J+1 = "+ j+1);
                }
            }
        }
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
