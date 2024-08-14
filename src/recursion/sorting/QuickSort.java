package recursion.sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        quickSort(arr, 0, arr.length-1);

        for(int num : arr){
            System.out.println(num);
        }
    }

    public  static void quickSort(int[] arr, int start, int end){
        if(start >= end){
            return;
        }

        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);
    }
//    {10, 7, 8, 9, 1, 5}
    public static int partition(int[] arr, int start, int end){
        int pos = start;

        for(int i = start; i <= end; i++){
            if(arr[i] <= arr[end]){
                swap(arr, i, pos);
                pos++;
            }
        }

        return pos-1;
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
