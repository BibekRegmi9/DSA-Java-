package array.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 0, 7};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            int index = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[index]){
                    index = j;
                }
            }
            swap(arr, i, index);
        }
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
