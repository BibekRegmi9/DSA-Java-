package recursion.sorting;

import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 1, 3, 5};
        mergeSort(arr, 0, arr.length-1);

        for(int i = 0; i <= arr.length-1; i++){
            System.out.println(arr[i]);
        }
    }

    public static void mergeSort(int[] arr, int start, int end){
        if(start == end){
            return;
        }

        int mid = start + (end - start)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);

        merge(arr, start, mid, end);
    }

    public static void merge(int[] arr, int start, int mid, int end){
        ArrayList<Integer> temp = new ArrayList<>(end - start + 1);

        int left = start;
        int right = mid + 1;

        while(left <= mid && right <= end){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // Add remaining elements from the left half
        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }

        // Add remaining elements from the right half
        while(right <= end){
            temp.add(arr[right]);
            right++;
        }

        // Copy the sorted elements back into the original array
        int index = 0;
        while(start <= end){
            arr[start] = temp.get(index);
            start++;
            index++;
        }
    }



    // from c++ pov
//    public static void merge(int[] arr, int start, int mid, int end){
//        ArrayList<Integer> temp = new ArrayList<>(end - start + 1);
//
//        int left = start;
//        int right = mid + 1;
//        int index = 0;
//
//        while(left <= mid && right <= end){
//            if(arr[left] <= arr[right]){
//                temp.add(index, arr[left]);
//                index++;
//                left++;
//            } else {
//                temp.add(index, arr[right]);
//                index++;
//                right++;
//            }
//        }
//
//        // Add remaining elements from the left half
//        while(left <= mid){
//            temp.add(index, arr[left]);
//            index++;
//            left++;
//        }
//
//        // Add remaining elements from the right half
//        while(right <= end){
//            index++;
//            temp.add(index, arr[right]);
//            right++;
//        }
//
//        // Copy the sorted elements back into the original array
//        index = 0;
//        while(start <= end){
//            arr[start] = temp.get(index);
//            start++;
//            index++;
//        }
//    }
}
