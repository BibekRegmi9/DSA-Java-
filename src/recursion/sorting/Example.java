package recursion.sorting;

import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        int[] data = {2, 6, 4, 6, 1, 3, 5};
        sortData(data, 0, data.length-1);

        for(int no: data){
            System.out.println(no);
        }
    }

    public static void sortData(int[] arr, int start, int end){
        if(start == end){
            return;
        }

        int mid = start + (end-start)/2;

        sortData(arr, start, mid);
        sortData(arr, mid+1, end);
        mergeData(arr, start, mid, end);
    }

    public static void mergeData(int[] arr, int start, int mid, int end){

        ArrayList<Integer> temp = new ArrayList<>(end - start + 1);

        int left = start;
        int right = mid +1;

        while(left <= mid && right <= end){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        //add remaining data to the left
        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }

        //add remaining data to the right
        while(right <= end){
            temp.add(arr[right]);
            right++;
        }

        //copy the temp sorted data back to the original array
        int index = 0;
        while(start <= end){
            arr[start] = temp.get(index);
            start++;
            index++;
        }

    }
}
