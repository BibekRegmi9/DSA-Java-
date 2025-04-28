package array.binarysearch;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr= {5,7,7,8,8,10};
        int[] ans = fl(arr, 8);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] fl(int[] arr, int target){
        int[] ans = {-1, -1};
        int start = binarySearch(arr, target, true);
        int end = binarySearch(arr, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    public static int binarySearch(int[] arr, int target, boolean isFirst){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;

                if(isFirst){
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;

    }
}
