package array.binarysearch;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
//        order agnostic binary search
//        int[] arr = {-56, -10, -1, 5, 12, 34};
//        int[] arr = {34, 12, 5, -1, -10, -56};
//        int target = -10;
//        int ans = orderAgnosticBinarySearch(arr, target);
//        System.out.println(ans);

        // first and last position of an element in an array
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = firstAndLastPosition(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int orderAgnosticBinarySearch(int [] arr, int target){
        if(arr.length < 1){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target < arr[mid]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }


    public static int[] firstAndLastPosition(int[] arr, int target){
        int[] ans = {-1, -1};
        for(int i = 0; i < arr.length; i++){
            if(target == arr[i]){
                ans[0] = i;
                break;
            }
        }
        for(int j = arr.length-1; j >= 0; j--){
            if(target == arr[j]){
                ans[1] = j;
                break;
            }
        }

        return ans;
    }
}
